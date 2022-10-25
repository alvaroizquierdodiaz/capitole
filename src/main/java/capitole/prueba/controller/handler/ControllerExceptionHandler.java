package capitole.prueba.controller.handler;

import capitole.prueba.constant.SwaggerConstants;
import capitole.prueba.exception.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import capitole.prueba.exception.EntityNotFoundException;

@RestControllerAdvice(basePackages = SwaggerConstants.PROJECT_CONTROLLER_PATH)
public class ControllerExceptionHandler {

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ExceptionHandler(value = EntityNotFoundException.class)
	public ErrorMessage resourceNotFoundException(EntityNotFoundException exception, WebRequest request) {
		return ErrorMessage.builder()
		        .message(exception.getMessage())
		        .statusCode(HttpStatus.OK.value())
		        .build();
	}

}
