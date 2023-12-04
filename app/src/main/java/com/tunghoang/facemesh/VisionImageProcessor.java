package com.tunghoang.facemesh;

import com.google.mlkit.common.MlKitException;
import com.tunghoang.facemesh.camera.FrameMetadata;
import com.tunghoang.facemesh.graphic.GraphicOverlay;

import java.nio.ByteBuffer;

/** An interface to process the images with different vision detectors and custom image models. */
public interface VisionImageProcessor {

    /** Processes ByteBuffer image data, e.g. used for Camera1 live preview case. */
    void processByteBuffer(
            ByteBuffer data, FrameMetadata frameMetadata, GraphicOverlay graphicOverlay)
            throws MlKitException;

    /** Stops the underlying machine learning model and release resources. */
    void stop();
}
