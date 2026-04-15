package me;

import androidx.lifecycle.q;
import se.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bd.q f15125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(yc.b bVar, w wVar) {
        super(wVar);
        if (wVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f15125b = (bd.q) bVar;
    }

    public final String toString() {
        return b() + ": Ext {" + this.f15125b + "}";
    }
}
