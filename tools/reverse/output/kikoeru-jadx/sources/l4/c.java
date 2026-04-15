package l4;

import android.app.Notification;
import android.os.Build;
import androidx.lifecycle.q;
import c7.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11710b;

    @Override // androidx.lifecycle.q
    public final void X0(e1 e1Var) {
        Notification.Builder builder = (Notification.Builder) e1Var.f3618b;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f11710b, null));
        } else {
            a.d(builder, a.b(a.a(), this.f11710b, null));
        }
    }
}
