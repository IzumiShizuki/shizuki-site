package w4;

import android.media.metrics.LogSessionId;
import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f23402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23403c;

    static {
        if (c0.f16548a < 31) {
            new k("");
        } else {
            new k(j.f23399b, "");
        }
    }

    public k(String str) {
        p4.c.i(c0.f16548a < 31);
        this.f23401a = str;
        this.f23402b = null;
        this.f23403c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f23401a, kVar.f23401a) && Objects.equals(this.f23402b, kVar.f23402b) && Objects.equals(this.f23403c, kVar.f23403c);
    }

    public final int hashCode() {
        return Objects.hash(this.f23401a, this.f23402b, this.f23403c);
    }

    public k(LogSessionId logSessionId, String str) {
        this(new j(logSessionId), str);
    }

    public k(j jVar, String str) {
        this.f23402b = jVar;
        this.f23401a = str;
        this.f23403c = new Object();
    }
}
