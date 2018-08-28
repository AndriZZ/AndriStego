package com.example.andri.andristego.activities.decrypt;

/**
 * Created by Andri Ivanov on 02/12/17.
 */

interface DecryptPresenter {

  /**
   * Opens a media chooser to select an image from Internal Storage
   * @param path to selected image
   */
  void selectImage(String path);

  /**
   * Interacts with interactor to start decryption process
   */
  void decryptMessage();
}
