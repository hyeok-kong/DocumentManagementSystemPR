package dms;

import java.io.File;
import java.io.IOException;

interface Importer { // 인터페이스로 다양한 종류의 파일을 임포트 구현
	Document importFile(File file) throws IOException;
}
