package dao.mypage.mystudy;

import java.util.List;

import dto.StudyTeamState;

public interface MyStudy {
	//MyStudy정보 select
	public List selectMyStudyInfo(int u_no);
	//DB삽입(준환 추가)
	public void insertMyStudy(StudyTeamState mystudy);
	//DB삭제(MyStudyList.jsp에서 버튼 클릭시 삭제, 준환추가)
	public void deleteMyStudy(int study_no,int u_no);
	
}
