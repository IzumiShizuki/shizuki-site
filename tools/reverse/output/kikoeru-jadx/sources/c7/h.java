package c7;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface h extends IInterface {
    CharSequence A();

    void C();

    r0 D();

    void E(String str, Bundle bundle);

    Bundle F();

    void G(String str, Bundle bundle);

    void I(String str, Bundle bundle);

    void J(f fVar);

    void K(int i10, int i11);

    void L();

    void M(Uri uri, Bundle bundle);

    void O(long j10);

    void T(float f10);

    boolean U(KeyEvent keyEvent);

    String a0();

    void b0(boolean z10);

    void c();

    int d0();

    String e();

    void e0(int i10);

    boolean f0();

    void g(f fVar);

    void g0(q0 q0Var);

    Bundle getExtras();

    void h(String str, Bundle bundle);

    p1 i();

    void i0(String str, Bundle bundle, c1 c1Var);

    List j0();

    void k();

    void k0(int i10);

    void m(Uri uri, Bundle bundle);

    void m0();

    void n0(q0 q0Var, int i10);

    void next();

    long o0();

    boolean p();

    int p0();

    void previous();

    PendingIntent q();

    void q0(long j10);

    m1 r0();

    int s();

    void s0(q0 q0Var);

    void stop();

    void t0(q1 q1Var, Bundle bundle);

    void u(String str, Bundle bundle);

    void u0(int i10);

    void w(q1 q1Var);

    void y(int i10, int i11);
}
