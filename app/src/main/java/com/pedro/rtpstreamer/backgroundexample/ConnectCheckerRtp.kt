package com.pedro.rtpstreamer.backgroundexample

import com.pedro.rtsp.utils.ConnectCheckerRtsp

/**
 * (Only working in kotlin)
 * Mix both connect interfaces to supportRTSP in service with same code.
 */
interface ConnectCheckerRtp: ConnectCheckerRtsp {

  /**
   * Commons
   */
  fun onConnectionSuccessRtp()

  fun onConnectionFailedRtp(reason: String)

  fun onNewBitrateRtp(bitrate: Long)

  fun onDisconnectRtp()

  fun onAuthErrorRtp()

  fun onAuthSuccessRtp()

  /**
   * RTSP
   */
  override fun onConnectionSuccessRtsp() {
    onConnectionSuccessRtp()
  }

  override fun onConnectionFailedRtsp(reason: String) {
    onConnectionFailedRtp(reason)
  }

  override fun onNewBitrateRtsp(bitrate: Long) {
    onNewBitrateRtp(bitrate)
  }

  override fun onDisconnectRtsp() {
    onDisconnectRtp()
  }

  override fun onAuthErrorRtsp() {
    onAuthErrorRtp()
  }

  override fun onAuthSuccessRtsp() {
    onAuthSuccessRtp()
  }
}