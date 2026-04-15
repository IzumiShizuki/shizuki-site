package gb;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f7488b;

    public /* synthetic */ l(n nVar, int i10) {
        this.f7487a = i10;
        this.f7488b = nVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f7487a) {
            case 0:
                this.f7488b.clear();
                break;
            default:
                this.f7488b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        m mVarA;
        switch (this.f7487a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                n nVar = this.f7488b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                m mVar = null;
                if (key != null) {
                    try {
                        mVarA = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                        mVarA = null;
                    }
                    break;
                } else {
                    mVarA = null;
                }
                if (mVarA != null && Objects.equals(mVarA.f7496h, entry.getValue())) {
                    mVar = mVarA;
                }
                return mVar != null;
            default:
                return this.f7488b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7487a) {
            case 0:
                return new k(this.f7488b, 0);
            default:
                return new k(this.f7488b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        m mVarA;
        switch (this.f7487a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                n nVar = this.f7488b;
                m mVar = null;
                if (key != null) {
                    try {
                        mVarA = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                        mVarA = null;
                    }
                    break;
                } else {
                    mVarA = null;
                }
                if (mVarA != null && Objects.equals(mVarA.f7496h, entry.getValue())) {
                    mVar = mVarA;
                }
                if (mVar == null) {
                    return false;
                }
                nVar.c(mVar, true);
                return true;
            default:
                n nVar2 = this.f7488b;
                m mVarA2 = null;
                if (obj != null) {
                    try {
                        mVarA2 = nVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mVarA2 != null) {
                    nVar2.c(mVarA2, true);
                }
                return mVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f7487a) {
        }
        return this.f7488b.f7502d;
    }
}
