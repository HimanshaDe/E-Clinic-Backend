/*
 * Copyright (C) 2021 Lumity, Inc. - All Rights Reserved
 *
 * CONFIDENTIAL
 *
 * All information contained herein is, and remains the property of Lumity, Inc. and its partners, if any.
 * The intellectual and technical concepts contained herein are proprietary to Lumity, Inc. and its partners
 * and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or
 * copyright law. Dissemination of this information or reproduction of this material is strictly forbidden unless
 * prior written permission is obtained from Lumity, Inc.
 */

package com.medicalsystem.eclinic.service.nlp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Entity {
  private String name;
  private String value;
  private Double confidence;
}
