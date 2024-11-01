package adapter.fileadapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @description
 * @since 24. 11. 1.
 */
class Client {

}

@Slf4j
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
class AjaxServiceAdapter implements AjaxService {

    private final FileService fileService;
    private final ObjectMapper objectMapper;

    public static AjaxServiceAdapter of(FileService fileService, ObjectMapper objectMapper) {
        return new AjaxServiceAdapter(fileService, objectMapper);
    }

    @Override
    public void convertJsonString() {

    }

}

interface AjaxService {
    void convertJsonString();
}

interface FileService {
    void read();

    void write();
}

@Slf4j
class TextFileService implements FileService {
    @Override
    public void read() {
        log.info("read = {}", this.getClass().getSimpleName());
    }

    @Override
    public void write() {
        log.info("write = {}", this.getClass().getSimpleName());
    }
}

@Slf4j
class ImageFileService implements FileService {
    @Override
    public void read() {
        log.info("read = {}", this.getClass().getSimpleName());
    }

    @Override
    public void write() {
        log.info("write = {}", this.getClass().getSimpleName());
    }
}

@Slf4j
class VideoFileService implements FileService {
    @Override
    public void read() {
        log.info("read = {}", this.getClass().getSimpleName());
    }

    @Override
    public void write() {
        log.info("write = {}", this.getClass().getSimpleName());
    }
}