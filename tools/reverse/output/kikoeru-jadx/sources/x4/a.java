package x4;

import java.util.Objects;
import java.util.Set;
import p4.c0;
import ya.l0;
import ya.m0;
import ya.o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24577d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f24580c;

    static {
        a aVar;
        if (c0.f16548a >= 33) {
            l0 l0Var = new l0(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                l0Var.a(Integer.valueOf(c0.s(i10)));
            }
            aVar = new a(2, l0Var.f());
        } else {
            aVar = new a(2, 10);
        }
        f24577d = aVar;
    }

    public a(int i10, Set set) {
        this.f24578a = i10;
        m0 m0VarQ = m0.q(set);
        this.f24580c = m0VarQ;
        o1 it = m0VarQ.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f24579b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f24578a == aVar.f24578a && this.f24579b == aVar.f24579b) {
            m0 m0Var = aVar.f24580c;
            int i10 = c0.f16548a;
            if (Objects.equals(this.f24580c, m0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f24578a * 31) + this.f24579b) * 31;
        m0 m0Var = this.f24580c;
        return i10 + (m0Var == null ? 0 : m0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f24578a + ", maxChannelCount=" + this.f24579b + ", channelMasks=" + this.f24580c + "]";
    }

    public a(int i10, int i11) {
        this.f24578a = i10;
        this.f24579b = i11;
        this.f24580c = null;
    }
}
