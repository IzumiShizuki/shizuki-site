package a3;

import java.util.Locale;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f194a;

    public b(Locale locale) {
        this.f194a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return l.a(this.f194a.toLanguageTag(), ((b) obj).f194a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f194a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f194a.toLanguageTag();
    }
}
