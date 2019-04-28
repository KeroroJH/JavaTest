package kro.tika.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;

public class MakeToZip {
    public static File makeToZip(File file ) throws IOException {
        String path = file.getPath();
        path =  path.substring(0, path.lastIndexOf(file.getName()));
        if( file.isDirectory() ){
        }
        //buffer size
        int size = 1024*64;
        byte[] buf = new byte[size];
        String outZipNm =path +"ieum.zip";
        System.out.println(outZipNm);
         
        FileInputStream fis = null;
        ZipArchiveOutputStream zos = null;
        BufferedInputStream bis = null;
     
        try{
            // Zip 파일생성
            zos = new ZipArchiveOutputStream(new BufferedOutputStream(new FileOutputStream(outZipNm)));
                 
                //buffer에 해당파일의 stream을 입력한다. 
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis,size);
                
                zos.putArchiveEntry(new ZipArchiveEntry(file.getName()));
                //압출레벨을 설정한다.
                //기본값은 8이라고 한다. 최대는 9이다.
                final int COMPRESSION_LEVEL = 1;
                zos.setLevel(COMPRESSION_LEVEL);
                 
                //준비된 버퍼에서 집출력스트림으로 write 한다.
                int len;
                while((len = bis.read(buf,0,size)) != -1){
                    zos.write(buf,0,len);
                }
                zos.closeArchiveEntry();
                bis.close();
                fis.close();
                          
            zos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return new File(outZipNm);
    }
}
