/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.nercis.isscp.idl.rules;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * NA_NUM 无风险，但要记录
 * A_NUM 一级风险
 * B_NUM 二级风险
 * J_NUM 十级风险
 * MIN_NUM 在电视上没有得风险，但要求记录
 * MAX_NUM 最高风险
 */
public enum Risk implements org.apache.thrift.TEnum {
  NA_NUM(0),
  A_NUM(1),
  B_NUM(2),
  J_NUM(3),
  MIN_NUM(4),
  MAX_NUM(5);

  private final int value;

  private Risk(int value) {
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
  public static Risk findByValue(int value) { 
    switch (value) {
      case 0:
        return NA_NUM;
      case 1:
        return A_NUM;
      case 2:
        return B_NUM;
      case 3:
        return J_NUM;
      case 4:
        return MIN_NUM;
      case 5:
        return MAX_NUM;
      default:
        return null;
    }
  }
}