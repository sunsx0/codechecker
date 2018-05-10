/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.nercis.isscp.idl;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * 定义调度优先级
 * HIGHER
 * HIGH
 * MEDIUM
 * LOW
 * LOWER
 */
public enum JobPriority implements org.apache.thrift.TEnum {
  HIGHER(9),
  HIGH(6),
  MEDIUM(4),
  LOW(2),
  LOWER(0);

  private final int value;

  private JobPriority(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static JobPriority findByValue(int value) { 
    switch (value) {
      case 9:
        return HIGHER;
      case 6:
        return HIGH;
      case 4:
        return MEDIUM;
      case 2:
        return LOW;
      case 0:
        return LOWER;
      default:
        return null;
    }
  }
}
