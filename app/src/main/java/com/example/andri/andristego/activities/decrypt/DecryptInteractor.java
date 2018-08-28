package com.example.andri.andristego.activities.decrypt;

/**
 * Created by Andri Ivanov on 02/12/17.
 */

interface DecryptInteractor {

  /**
   * Starts performing decryption of image selected from Internal Memory
   * @param path to selected image
   *
   */
  void performDecryption(String path);

}
