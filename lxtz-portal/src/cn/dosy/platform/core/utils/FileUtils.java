package cn.dosy.platform.core.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 * 附件工具类
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月07日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年12月07日；
 */
public class FileUtils {
	public FileUtils() {

	}

	/**
	 * 补齐文件夹分隔符
	 * 
	 * @param dirName
	 * @return
	 */
	public static String addSeparatorIfNec(String dirName) {
		if (StringUtils.isNotBlank(dirName)) {
			String dirSeparator = File.separator;
			if (!dirName.endsWith(dirSeparator))
				dirName += dirSeparator;
		}
		return dirName;
	}
	
	/**
	 * 将二进制输入流保存到文件
	 * 
	 * @param stream 输入流
	 * @param path 文件保存路径
	 * @param filename 文件名称
	 * @throws IOException
	 */
	public static void SaveFileFromInputStream(InputStream stream,String path,String filename) throws IOException {      
        FileOutputStream fs=new FileOutputStream( path + "/"+ filename);
        byte[] buffer =new byte[1024*1024];
        int byteread = 0; 
        while ((byteread=stream.read(buffer))!=-1)
        {
           fs.write(buffer,0,byteread);
           fs.flush();
        } 
        fs.close();
        stream.close();      
    }
	
	/**
	 * 将二进制输入流保存到文件(自动创建目录)
	 * 
	 * @param stream 输入流
	 * @param path 文件保存路径
	 * @param filename 文件名称
	 * @throws IOException
	 */
	public static void SaveFileFromInputStream2(InputStream stream,String path,String filename) throws IOException {  
		File saveDirFile = new File(path);
		if (!saveDirFile.exists()) {
			saveDirFile.mkdirs();
		}
		
        FileOutputStream fs=new FileOutputStream( path + "/"+ filename);
        byte[] buffer =new byte[1024*1024];
        int byteread = 0; 
        while ((byteread=stream.read(buffer))!=-1)
        {
           fs.write(buffer,0,byteread);
           fs.flush();
        } 
        fs.close();
        stream.close();      
    }
	
	/**
	 * InputStream转byte[]
	 * 
	 * @param input
	 * @return
	 * @exception IOException
	 * */
	public static byte[] inputStream2ByteArray(InputStream input) throws IOException {
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    byte[] buffer = new byte[4096];
	    int n = 0;
	    while (-1 != (n = input.read(buffer))) {
	        output.write(buffer, 0, n);
	    }
	    return output.toByteArray();
	}
	
	/**
     * 删除单个文件
     * @param   path 
     * 				文件路径
     * @param   file 
     * 				文件名称    
     */
    public static void deleteFile(String path, String fileName) {
        File file = new File(path + File.separator + fileName);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
        }
    }
    
    /**
     * 获取文件类型
     * 
     * @param fileName
     * 				文件名
     * @return
     * */
    public static String getSuffix(String fileName) {
    	if (StringUtils.isNotBlank(fileName)) {
    		return fileName.substring(fileName.indexOf(".") + 1);
    	}
    	return "";
    }
	
}
