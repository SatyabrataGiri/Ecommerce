package com.ecom.service.impl;

import java.nio.file.Path;

public interface MultipartFile {

	boolean isEmpty();

	String getOriginalFilename();

	Path getInputStream();

}
