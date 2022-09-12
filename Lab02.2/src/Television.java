package com.entertainment;

import java.util.Set;

public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;
  public static final Set<String> VALID_BRANDS = Set.of("Samsung", "LG", "Sony", "Toshiba");

  private static final String INVALID_BRAND_FORMAT =
      "%s is not a valid brand; one of %s is required.%n";
  private static final String INVALID_VOLUME_FORMAT =
      "%d is invalid; volume must be between %d and %d (inclusive).%n";
  private static final String TO_STRING_FORMAT = "com.entertainment.Television: bran=%s, volume=%d, displayi=%s";

  private static int instanceCount = 0;

  private String brand;
  private int volume;
  private DisplayType display = DisplayType.LED;

  public Television() { instanceCount++; }



  public Television(String brand) {
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);
  }


}

