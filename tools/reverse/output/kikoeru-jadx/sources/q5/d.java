package q5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import b5.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f17780a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f17781b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f17782c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f17783d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f17784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c[] f17785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17786g;

    public d(Display display, c... cVarArr) {
        this.f17784e = display;
        this.f17785f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f17780a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f17784e.getRotation();
        float[] fArr3 = this.f17781b;
        if (rotation != 0) {
            int i11 = 129;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i11 = 130;
                    i10 = 1;
                }
            } else {
                i11 = 2;
                i10 = 129;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i11, i10, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f17783d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f10 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z10 = this.f17786g;
        float[] fArr5 = this.f17782c;
        if (!z10) {
            d0.g(fArr5, fArr2);
            this.f17786g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i12 = 0; i12 < 2; i12++) {
            this.f17785f[i12].a(fArr2, f10);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
