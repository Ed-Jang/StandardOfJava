package ChainedExceptionEx;

class ChainedExceptionEx {
	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main의 끝

	static void install() throws InstallException {
		try {
			startInstall(); // 프로그램설치에 필요한 준비
			copyFiles();// 파일 복사
		} catch (SpaceException se) {
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();// 프로그램 설치에 사용된 임시파일들을 삭제
		} // try끝
	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다");
		}

		if (!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다");
		}
	}// startInstall메서드의 끝

	static void copyFiles() {

	}

	static void deleteTempFiles() {

	}

	static boolean enoughSpace() {
		// 설치하는데 필요한 공간 확인
		return false;
	}

	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간 확인
		return true;
	}
}// ExceptionTest끝

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}