package q5;

import a9.m;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import p5.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f17828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SensorManager f17829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sensor f17830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f17831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f17832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f17833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f17834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Surface f17835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17838k;

    public k(Context context) {
        super(context, null);
        this.f17828a = new CopyOnWriteArrayList();
        this.f17832e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f17829b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f17830c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f17833f = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f17831d = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.f17836i = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z10 = this.f17836i && this.f17837j;
        Sensor sensor = this.f17830c;
        if (sensor == null || z10 == this.f17838k) {
            return;
        }
        d dVar = this.f17831d;
        SensorManager sensorManager = this.f17829b;
        if (z10) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.f17838k = z10;
    }

    public a getCameraMotionListener() {
        return this.f17833f;
    }

    public q getVideoFrameMetadataListener() {
        return this.f17833f;
    }

    public Surface getVideoSurface() {
        return this.f17835h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17832e.post(new m(19, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f17837j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f17837j = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f17833f.f17814k = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f17836i = z10;
        a();
    }
}
