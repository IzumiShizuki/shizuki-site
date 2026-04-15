package yd;

import ce.q;
import y0.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q[] f26170d;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i10, q[] qVarArr) {
        if (qVarArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i11 = 1;
        int length = qVarArr.length - 1;
        if (length != 0) {
            for (int i12 = 31; i12 >= 0; i12--) {
                if (((1 << i12) & length) != 0) {
                    i11 = 1 + i12;
                }
            }
            throw new IllegalStateException("Empty enum: " + qVarArr.getClass());
        }
        super(i10, i11, 1, (byte) 0);
        this.f26170d = qVarArr;
    }

    @Override // y0.i0
    public final Object d(int i10) {
        int i11 = (1 << this.f25325c) - 1;
        int i12 = this.f25324b;
        int i13 = (i10 & (i11 << i12)) >> i12;
        for (q qVar : this.f26170d) {
            if (qVar.a() == i13) {
                return qVar;
            }
        }
        return null;
    }
}
