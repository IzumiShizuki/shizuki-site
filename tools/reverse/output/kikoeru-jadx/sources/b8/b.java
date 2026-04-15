package b8;

import a9.o;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f2234b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f2236d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f2237a;

    static {
        a9.g gVar = new a9.g(16);
        ub.i iVar = ub.i.f21541b;
        f2235c = ub.a.c(iVar, gVar);
        f2236d = ub.a.c(iVar, new a9.g(17));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f2237a = sQLiteDatabase;
    }

    @Override // a8.a
    public final void A() {
        this.f2237a.setTransactionSuccessful();
    }

    @Override // a8.a
    public final void C() {
        this.f2237a.beginTransactionNonExclusive();
    }

    @Override // a8.a
    public final void I() {
        this.f2237a.endTransaction();
    }

    @Override // a8.a
    public final boolean T() {
        return this.f2237a.inTransaction();
    }

    @Override // a8.a
    public final boolean U() {
        return this.f2237a.isWriteAheadLoggingEnabled();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2237a.close();
    }

    @Override // a8.a
    public final Cursor f() {
        return t(new pe.d(2));
    }

    @Override // a8.a
    public final void h() {
        this.f2237a.beginTransaction();
    }

    @Override // a8.a
    public final boolean isOpen() {
        return this.f2237a.isOpen();
    }

    @Override // a8.a
    public final void l(String str) {
        l.e(str, "sql");
        this.f2237a.execSQL(str);
    }

    @Override // a8.a
    public final i p(String str) {
        l.e(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f2237a.compileStatement(str);
        l.d(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new i(sQLiteStatementCompileStatement);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ub.h] */
    @Override // a8.a
    public final void r() throws IllegalAccessException, InvocationTargetException {
        ?? r22 = f2236d;
        if (((Method) r22.getValue()) != null) {
            ?? r32 = f2235c;
            if (((Method) r32.getValue()) != null) {
                Method method = (Method) r22.getValue();
                l.b(method);
                Method method2 = (Method) r32.getValue();
                l.b(method2);
                Object objInvoke = method2.invoke(this.f2237a, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        h();
    }

    @Override // a8.a
    public final Cursor t(a8.d dVar) {
        final o oVar = new o(2, dVar);
        Cursor cursorRawQueryWithFactory = this.f2237a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: b8.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) oVar.l(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.q(), f2234b, null);
        l.d(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }
}
