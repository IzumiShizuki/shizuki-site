.class public abstract Lj1/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lj1/e;

.field public static final b:Lj1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj1/e;

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lj1/e;-><init>(F)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lj1/a;->a:Lj1/e;

    .line 9
    .line 10
    new-instance v0, Lj1/e;

    .line 11
    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lj1/e;-><init>(F)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lj1/a;->b:Lj1/e;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static final a(Lj1/q;Lic/o;)Lj1/q;
    .locals 1

    .line 1
    new-instance v0, Lj1/k;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lj1/k;-><init>(Lic/o;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public static final b(Lj1/q;Lx0/o;)Lj1/q;
    .locals 2

    .line 1
    sget-object v0, Lj1/l;->b:Lj1/l;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lj1/q;->k(Lic/k;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const v0, 0x48ae8da7

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lx0/o;->X(I)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcg/d;

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-direct {v0, v1, p1}, Lcg/d;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lj1/n;->a:Lj1/n;

    .line 24
    .line 25
    invoke-interface {p0, v0, v1}, Lj1/q;->a(Lic/n;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lj1/q;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p1, v0}, Lx0/o;->p(Z)V

    .line 33
    .line 34
    .line 35
    return-object p0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public static final c(Lj1/q;Lx0/o;)Lj1/q;
    .locals 1

    .line 1
    const v0, 0x1a365f2c

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lx0/o;->W(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, Lj1/a;->b(Lj1/q;Lx0/o;)Lj1/q;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Lx0/o;->p(Z)V

    .line 13
    .line 14
    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method
