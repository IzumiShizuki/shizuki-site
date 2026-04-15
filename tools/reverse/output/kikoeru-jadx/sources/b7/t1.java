package b7;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7.k1 f2095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1 f2098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f2099e;

    public t1(c7.k1 k1Var, int i10, int i11, boolean z10, s1 s1Var, Bundle bundle) {
        this.f2095a = k1Var;
        this.f2096b = i10;
        this.f2097c = i11;
        this.f2098d = s1Var;
        this.f2099e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        t1 t1Var = (t1) obj;
        s1 s1Var = t1Var.f2098d;
        s1 s1Var2 = this.f2098d;
        if (s1Var2 == null && s1Var == null) {
            return this.f2095a.equals(t1Var.f2095a);
        }
        int i10 = p4.c0.f16548a;
        return Objects.equals(s1Var2, s1Var);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2098d, this.f2095a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        c7.k1 k1Var = this.f2095a;
        sb.append(k1Var.f3655a.f3652a);
        sb.append(", uid=");
        sb.append(k1Var.f3655a.f3654c);
        sb.append("}");
        return sb.toString();
    }
}
