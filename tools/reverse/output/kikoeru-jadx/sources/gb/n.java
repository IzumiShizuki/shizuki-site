package gb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f7498i = new j(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f7501c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f7504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f7505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f7506h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7502d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7503e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f7499a = f7498i;

    public n(boolean z10) {
        this.f7500b = z10;
        this.f7504f = new m(z10);
    }

    public final m a(Object obj, boolean z10) {
        int iCompareTo;
        m mVar;
        m mVar2 = this.f7501c;
        j jVar = f7498i;
        Comparator comparator = this.f7499a;
        if (mVar2 != null) {
            Comparable comparable = comparator == jVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mVar2.f7494f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return mVar2;
                }
                m mVar3 = iCompareTo < 0 ? mVar2.f7490b : mVar2.f7491c;
                if (mVar3 == null) {
                    break;
                }
                mVar2 = mVar3;
            }
        } else {
            iCompareTo = 0;
        }
        m mVar4 = mVar2;
        if (!z10) {
            return null;
        }
        m mVar5 = this.f7504f;
        if (mVar4 != null) {
            mVar = new m(this.f7500b, mVar4, obj, mVar5, mVar5.f7493e);
            if (iCompareTo < 0) {
                mVar4.f7490b = mVar;
            } else {
                mVar4.f7491c = mVar;
            }
            b(mVar4, true);
        } else {
            if (comparator == jVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mVar = new m(this.f7500b, mVar4, obj, mVar5, mVar5.f7493e);
            this.f7501c = mVar;
        }
        this.f7502d++;
        this.f7503e++;
        return mVar;
    }

    public final void b(m mVar, boolean z10) {
        while (mVar != null) {
            m mVar2 = mVar.f7490b;
            m mVar3 = mVar.f7491c;
            int i10 = mVar2 != null ? mVar2.f7497i : 0;
            int i11 = mVar3 != null ? mVar3.f7497i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                m mVar4 = mVar3.f7490b;
                m mVar5 = mVar3.f7491c;
                int i13 = (mVar4 != null ? mVar4.f7497i : 0) - (mVar5 != null ? mVar5.f7497i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    e(mVar);
                } else {
                    f(mVar3);
                    e(mVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                m mVar6 = mVar2.f7490b;
                m mVar7 = mVar2.f7491c;
                int i14 = (mVar6 != null ? mVar6.f7497i : 0) - (mVar7 != null ? mVar7.f7497i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(mVar);
                } else {
                    e(mVar2);
                    f(mVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                mVar.f7497i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                mVar.f7497i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            mVar = mVar.f7489a;
        }
    }

    public final void c(m mVar, boolean z10) {
        m mVar2;
        m mVar3;
        int i10;
        if (z10) {
            m mVar4 = mVar.f7493e;
            mVar4.f7492d = mVar.f7492d;
            mVar.f7492d.f7493e = mVar4;
        }
        m mVar5 = mVar.f7490b;
        m mVar6 = mVar.f7491c;
        m mVar7 = mVar.f7489a;
        int i11 = 0;
        if (mVar5 == null || mVar6 == null) {
            if (mVar5 != null) {
                d(mVar, mVar5);
                mVar.f7490b = null;
            } else if (mVar6 != null) {
                d(mVar, mVar6);
                mVar.f7491c = null;
            } else {
                d(mVar, null);
            }
            b(mVar7, false);
            this.f7502d--;
            this.f7503e++;
            return;
        }
        if (mVar5.f7497i > mVar6.f7497i) {
            m mVar8 = mVar5.f7491c;
            while (true) {
                m mVar9 = mVar8;
                mVar3 = mVar5;
                mVar5 = mVar9;
                if (mVar5 == null) {
                    break;
                } else {
                    mVar8 = mVar5.f7491c;
                }
            }
        } else {
            m mVar10 = mVar6.f7490b;
            while (true) {
                mVar2 = mVar6;
                mVar6 = mVar10;
                if (mVar6 == null) {
                    break;
                } else {
                    mVar10 = mVar6.f7490b;
                }
            }
            mVar3 = mVar2;
        }
        c(mVar3, false);
        m mVar11 = mVar.f7490b;
        if (mVar11 != null) {
            i10 = mVar11.f7497i;
            mVar3.f7490b = mVar11;
            mVar11.f7489a = mVar3;
            mVar.f7490b = null;
        } else {
            i10 = 0;
        }
        m mVar12 = mVar.f7491c;
        if (mVar12 != null) {
            i11 = mVar12.f7497i;
            mVar3.f7491c = mVar12;
            mVar12.f7489a = mVar3;
            mVar.f7491c = null;
        }
        mVar3.f7497i = Math.max(i10, i11) + 1;
        d(mVar, mVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f7501c = null;
        this.f7502d = 0;
        this.f7503e++;
        m mVar = this.f7504f;
        mVar.f7493e = mVar;
        mVar.f7492d = mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        m mVarA = null;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mVarA != null;
    }

    public final void d(m mVar, m mVar2) {
        m mVar3 = mVar.f7489a;
        mVar.f7489a = null;
        if (mVar2 != null) {
            mVar2.f7489a = mVar3;
        }
        if (mVar3 == null) {
            this.f7501c = mVar2;
        } else if (mVar3.f7490b == mVar) {
            mVar3.f7490b = mVar2;
        } else {
            mVar3.f7491c = mVar2;
        }
    }

    public final void e(m mVar) {
        m mVar2 = mVar.f7490b;
        m mVar3 = mVar.f7491c;
        m mVar4 = mVar3.f7490b;
        m mVar5 = mVar3.f7491c;
        mVar.f7491c = mVar4;
        if (mVar4 != null) {
            mVar4.f7489a = mVar;
        }
        d(mVar, mVar3);
        mVar3.f7490b = mVar;
        mVar.f7489a = mVar3;
        int iMax = Math.max(mVar2 != null ? mVar2.f7497i : 0, mVar4 != null ? mVar4.f7497i : 0) + 1;
        mVar.f7497i = iMax;
        mVar3.f7497i = Math.max(iMax, mVar5 != null ? mVar5.f7497i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.f7505g;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.f7505g = lVar2;
        return lVar2;
    }

    public final void f(m mVar) {
        m mVar2 = mVar.f7490b;
        m mVar3 = mVar.f7491c;
        m mVar4 = mVar2.f7490b;
        m mVar5 = mVar2.f7491c;
        mVar.f7490b = mVar5;
        if (mVar5 != null) {
            mVar5.f7489a = mVar;
        }
        d(mVar, mVar2);
        mVar2.f7491c = mVar;
        mVar.f7489a = mVar2;
        int iMax = Math.max(mVar3 != null ? mVar3.f7497i : 0, mVar5 != null ? mVar5.f7497i : 0) + 1;
        mVar.f7497i = iMax;
        mVar2.f7497i = Math.max(iMax, mVar4 != null ? mVar4.f7497i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        m mVarA;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
                mVarA = null;
            }
        } else {
            mVarA = null;
        }
        if (mVarA != null) {
            return mVarA.f7496h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        l lVar = this.f7506h;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.f7506h = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f7500b) {
            throw new NullPointerException("value == null");
        }
        m mVarA = a(obj, true);
        Object obj3 = mVarA.f7496h;
        mVarA.f7496h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m mVarA;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
                mVarA = null;
            }
        } else {
            mVarA = null;
        }
        if (mVarA != null) {
            c(mVarA, true);
        }
        if (mVarA != null) {
            return mVarA.f7496h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7502d;
    }
}
