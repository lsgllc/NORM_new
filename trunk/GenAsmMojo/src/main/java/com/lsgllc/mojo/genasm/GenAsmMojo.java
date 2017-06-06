package com.lsgllc.mojo.genasm;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.objectweb.asm.Opcodes;

import java.io.IOException;

/**
 * Goal which touches a timestamp file.
 *
 * @goal generate
 *
 * @phase package
 */
public class GenAsmMojo
        extends AbstractMojo
{
    /**
     * Location of the file.
     * @parameter default-value="${norm.asm.dest.rsrc.dir}"
     * @required
     */
    public String resourceDirectory;
    /**
     * Location of the file.
     * @parameter default-value="${norm.asm.propertiesFile.name}"
     * @required
     */
    public String cfgPropertiesFilename;
    /**
     * Location of the file.
     * @parameter default-value="${norm.asm.model.native.className}"
     * @required
     */
    public String jmNativeImpl;
    /**
     * Location of the file.
     * @parameter default-value="${norm.asm.model.ready.className}"
     * @required
     */
    public String jmReadyImpl;
    /**
     * Location of the file.
     * @parameter default-value="${norm.asm.model.native.iface}"
     * @required
     */
    public String jmNativeIface;
    /**
     * Location of the file.
     * @parameter default-value="${norm.asm.model.ready.iface}"
     * @required
     */
    public String jmReadyIface;
    /**
     * Location of the file.
     * @parameter default-value="${norm.asm.commentOutCode}"
     * @required
     */
    public boolean commentOutCode;
    /**
     * Location of the file.
     * @parameter default-value="${project.build.directory}"
     * @required
     */
    public String outputDir;

    private static final KeyMaker km = KeyMaker.getInstance();
    public void execute()
            throws MojoExecutionException
    {
        String implSrc1 = null;
        String implSrc2 = null;
        String iFaceSrc1 = null;
        String iFaceSrc2 = null;

        if (jmNativeImpl != null && !jmNativeImpl.isEmpty()) {
            implSrc1 = processClassFile(jmNativeImpl,null,null);
        }
        if (jmReadyImpl != null && !jmReadyImpl.isEmpty()) {
            implSrc2 = processClassFile(jmReadyImpl,resourceDirectory + "/" + cfgPropertiesFilename,implSrc1);
        }
        if (jmNativeIface != null && !jmNativeIface.isEmpty()) {
            iFaceSrc1 = processClassFile(jmNativeIface,null,null);
        }
        if (jmReadyIface != null && !jmReadyIface.isEmpty()) {
            iFaceSrc2 = processClassFile(jmReadyIface,resourceDirectory + "/" + cfgPropertiesFilename,iFaceSrc1);
        }
    }                //


    private String processClassFile(String fileName, String crusherPropFleName, String implSrc1) throws MojoExecutionException {
        if (fileName == null || fileName.isEmpty()) {
            return null;
        }
        String fileNameMajor = getFileNameMajor(fileName);
        String canonicalPropertyFileNameMajor = getCanonicalPropertyFileNameMajor(fileNameMajor);
        getLog().info( "commentOutCode is " + ((commentOutCode)?"true":"false"));
        getLog().info( "Creating template file: " + resourceDirectory + "/" + fileNameMajor );
        getLog().info("Generating Byte-Code instructions using " + fileName);
        if (fileName == null || fileName.length() == 0){
            getLog().info("Parameter fileName is null");
            return null;
        }

        try
        {
            String nameMod = outputDir + "/classes/" + fileName.replace('.','/') + ".class";
//            ClassPathHacker.addFile(f);
            getLog().info("attempting to load class  " + nameMod + " as a resource...");
//            InputStream is = new FileInputStream(nameMod);
            km.clear();
            new NormGenASMifier(Opcodes.ASM4, nameMod, 0, canonicalPropertyFileNameMajor,commentOutCode,crusherPropFleName,implSrc1,km, true);
        }
        catch ( Exception e )
        {
            e.printStackTrace();
            throw new MojoExecutionException( "Error Creating Byte Code properties file" , e );
        }
        finally
        {
            return canonicalPropertyFileNameMajor;
        }
    }

    private String getCanonicalPropertyFileNameMajor(String fileNameMajor) {
        return resourceDirectory + "/" + fileNameMajor;
    }

    private String getFileNameMajor(String fileName) {
        return fileName.substring(fileName.lastIndexOf('.')+1);
    }
}
