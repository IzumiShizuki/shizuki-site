.class public final Lsc/x0;
.super Lsc/i0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic d:I


# instance fields
.field public final b:Ljava/lang/Class;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-string v0, "jClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lsc/x0;->b:Ljava/lang/Class;

    .line 10
    .line 11
    new-instance p1, Lsc/t0;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, p0, v0}, Lsc/t0;-><init>(Lsc/x0;I)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lub/i;->a:Lub/i;

    .line 18
    .line 19
    invoke-static {v0, p1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lsc/x0;->c:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
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
.end method


# virtual methods
.method public final b()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lsc/x0;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lsc/x0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lsc/x0;

    .line 6
    .line 7
    iget-object p1, p1, Lsc/x0;->b:Ljava/lang/Class;

    .line 8
    .line 9
    iget-object v0, p0, Lsc/x0;->b:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v0, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
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
.end method

.method public final f()Ljava/util/Collection;
    .locals 1

    .line 1
    sget-object v0, Lvb/r;->a:Lvb/r;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method

.method public final g(Lbe/e;)Ljava/util/Collection;
    .locals 3

    .line 1
    iget-object v0, p0, Lsc/x0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsc/w0;

    .line 8
    .line 9
    iget-object v0, v0, Lsc/w0;->d:Lsc/z1;

    .line 10
    .line 11
    sget-object v1, Lsc/w0;->g:[Lpc/u;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0}, Lsc/z1;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "getValue(...)"

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v0, Lle/o;

    .line 26
    .line 27
    sget-object v1, Lgd/b;->b:Lgd/b;

    .line 28
    .line 29
    invoke-interface {v0, p1, v1}, Lle/o;->f(Lbe/e;Lgd/b;)Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
.end method

.method public final h(I)Lyc/k0;
    .locals 8

    .line 1
    iget-object v0, p0, Lsc/x0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsc/w0;

    .line 8
    .line 9
    iget-object v0, v0, Lsc/w0;->f:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lub/q;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lub/q;->a:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, v1

    .line 22
    check-cast v4, Lae/f;

    .line 23
    .line 24
    iget-object v1, v0, Lub/q;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lwd/f0;

    .line 27
    .line 28
    iget-object v0, v0, Lub/q;->c:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v0

    .line 31
    check-cast v6, Lyd/e;

    .line 32
    .line 33
    sget-object v0, Lzd/j;->n:Lce/o;

    .line 34
    .line 35
    const-string v2, "packageLocalVariable"

    .line 36
    .line 37
    invoke-static {v0, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v0, p1}, Lvb/w;->n(Lce/m;Lce/o;I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    move-object v3, p1

    .line 45
    check-cast v3, Lwd/j0;

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    new-instance v5, Lbd/f0;

    .line 50
    .line 51
    iget-object p1, v1, Lwd/f0;->g:Lwd/z0;

    .line 52
    .line 53
    const-string v0, "getTypeTable(...)"

    .line 54
    .line 55
    invoke-static {p1, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v5, p1}, Lbd/f0;-><init>(Lwd/z0;)V

    .line 59
    .line 60
    .line 61
    sget-object v7, Lsc/w;->c:Lsc/w;

    .line 62
    .line 63
    iget-object v2, p0, Lsc/x0;->b:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-static/range {v2 .. v7}, Lsc/f2;->f(Ljava/lang/Class;Lce/m;Lyd/f;Lbd/f0;Lyd/a;Lic/n;)Lyc/b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lyc/k0;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_0
    const/4 p1, 0x0

    .line 73
    return-object p1
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lsc/x0;->b:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
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
.end method

.method public final j()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lsc/x0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsc/w0;

    .line 8
    .line 9
    iget-object v0, v0, Lsc/w0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Class;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lsc/x0;->b:Ljava/lang/Class;

    .line 20
    .line 21
    :cond_0
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final k(Lbe/e;)Ljava/util/Collection;
    .locals 3

    .line 1
    iget-object v0, p0, Lsc/x0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsc/w0;

    .line 8
    .line 9
    iget-object v0, v0, Lsc/w0;->d:Lsc/z1;

    .line 10
    .line 11
    sget-object v1, Lsc/w0;->g:[Lpc/u;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0}, Lsc/z1;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "getValue(...)"

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v0, Lle/o;

    .line 26
    .line 27
    sget-object v1, Lgd/b;->b:Lgd/b;

    .line 28
    .line 29
    invoke-interface {v0, p1, v1}, Lle/o;->b(Lbe/e;Lgd/b;)Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "file class "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lsc/x0;->b:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {v1}, Led/d;->a(Ljava/lang/Class;)Lbe/b;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lbe/b;->a()Lbe/c;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
.end method
