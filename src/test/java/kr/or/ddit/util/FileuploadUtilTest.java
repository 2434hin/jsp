package kr.or.ddit.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileuploadUtilTest {

	/**
	 *
	 * Method : getFilenameTest
	 * 작성자 : PC-11
	 * 변경이력 :
	 * Method 설명 : Content-Disposition 헤더 문자열로 부터 파일이름 추출 테스트
	 */
	@Test
	public void getFilenameTest() {
		/***Given***/
		String contentDisposition = "form-data; name=\"file\"; filename=\"brown.png\"";
		String contentDisposition2 = "form-data; name=\"file\"; filename=\"moon.png\"";
		/***When***/
		String filename = FileuploadUtil.getFilename(contentDisposition);
		String filename2 = FileuploadUtil.getFilename(contentDisposition2);

		/***Then***/
		assertEquals("brown.png", filename);
		assertEquals("moon.png", filename2);

	}

  /**
    *
    * Method : getFileExtentionTest
    * 작성자 : PC-23
    * 변경이력 :
    * Method 설명 : Content-dispostion 헤더 문자열로 부터 파일확장자 추출 테스트
    */
   @Test
   public void getFileExtensionTest() {
      /***Given***/
      String contentDsipostion = "form-data; name=\file\"; filename=\"brown.png\"";
      String contentDsipostion2 = "form-data; name=\file\"; filename=\"sally.png\"";
      String contentDsipostion3 = "form-data; name=\file\"; filename=\"sally\"";
      String contentDsipostion4 = "form-data; name=\file\"; filename=\"sally.xx.jpg\"";

      /***When***/
      String fileExtensionName = FileuploadUtil.getFileExtension(contentDsipostion);
      String fileExtensionName2 = FileuploadUtil.getFileExtension(contentDsipostion2);
      String fileExtensionName3 = FileuploadUtil.getFileExtension(contentDsipostion3);
      String fileExtensionName4 = FileuploadUtil.getFileExtension(contentDsipostion4);

      /***Then***/
      assertEquals(".png", fileExtensionName);
      assertEquals(".png", fileExtensionName2);
      assertEquals("", fileExtensionName3);
      assertEquals(".jpg", fileExtensionName4);

   }

   /**
    *
    * Method : getPathTest
    * 작성자 : PC-11
    * 변경이력 :
    * Method 설명 : 파일 업로드 경로 조회하기 테스트
    */
   @Test
   public void getPathTest(){
	   /***Given***/

	   /***When***/
	   String path = FileuploadUtil.getPath();

	   /***Then***/
	   assertEquals("e:\\upload\\2019\\08\\", path);
   }

}
