package com.spring.demo.dto;

import jakarta.validation.constraints.NotNull;

public record ClientRecordDto(@NotNull String nmCliente, @NotNull String cdEmpresa) {

}
