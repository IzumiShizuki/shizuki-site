package x4;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import b7.m2;
import java.util.Objects;
import r.y1;
import y6.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f24599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f24600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f24601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m2 f24602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f24603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f24604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y1 f24605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m4.d f24606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24607j;

    public e(Context context, c0 c0Var, m4.d dVar, y1 y1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f24598a = applicationContext;
        this.f24599b = c0Var;
        this.f24606i = dVar;
        this.f24605h = y1Var;
        Handler handlerO = p4.c0.o(null);
        this.f24600c = handlerO;
        this.f24601d = p4.c0.f16548a >= 23 ? new c(this) : null;
        this.f24602e = new m2(3, this);
        b bVar = b.f24582c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f24603f = uriFor != null ? new d(this, handlerO, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(b bVar) {
        m5.p pVar;
        if (!this.f24607j || bVar.equals(this.f24604g)) {
            return;
        }
        this.f24604g = bVar;
        v vVar = (v) this.f24599b.f25579a;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = vVar.f24702f0;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper == null ? "null" : looperMyLooper.getThread().getName()) + ") is not the playback looper (" + name + ")");
        }
        b bVar2 = vVar.f24722w;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        vVar.f24722w = bVar;
        y1 y1Var = vVar.f24717r;
        if (y1Var != null) {
            x xVar = (x) y1Var.f18634b;
            synchronized (xVar.f22450a) {
                pVar = xVar.f22466q;
            }
            if (pVar != null) {
                pVar.k();
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        y1 y1Var = this.f24605h;
        AudioDeviceInfo audioDeviceInfo2 = y1Var == null ? null : (AudioDeviceInfo) y1Var.f18634b;
        int i10 = p4.c0.f16548a;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        y1 y1Var2 = audioDeviceInfo != null ? new y1(27, audioDeviceInfo) : null;
        this.f24605h = y1Var2;
        a(b.c(this.f24598a, this.f24606i, y1Var2));
    }
}
