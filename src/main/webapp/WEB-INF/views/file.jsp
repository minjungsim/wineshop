<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>

<%@page import="com.oreilly.servlet.MultipartRequest"%>

<%@ page pageEncoding="UTF-8"%>

<%

//String dir = application.getRealPath("wineshop/C:/Users/SSG/PycharmProjects/wine5");
String dir="C:/Users/SSG/PycharmProjects/wine5";
System.out.println("============ uploadFilePath1 = " + dir);
 // 저는 "/altong/mon" 밑에 이미지를 저장했습니다.



int max = 10*1024*1024;

//최대크기, dir 디렉토리에 파일을 업로드하는 multipartRequest



MultipartRequest mr = new MultipartRequest(request, dir, max, "UTF-8");
System.out.println("============ uploadFilePath2 = " + dir);
String orgFileName = mr.getParameter("uploaded_file");
System.out.println("============ uploadFilePath3 = " + dir);
String saveFileName = mr.getFilesystemName("uploaded_file");
System.out.println("============ uploadFilePath4 = " + dir);



out.println(orgFileName+"이 저장되었습니다.");



%>
