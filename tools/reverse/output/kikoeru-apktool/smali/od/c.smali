.class public final Lod/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lzc/h;


# instance fields
.field public final a:Lb0/w1;

.field public final b:Lsd/b;

.field public final c:Z

.field public final d:Lre/j;


# direct methods
.method public constructor <init>(Lb0/w1;Lsd/b;Z)V
    .locals 1

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "annotationOwner"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lod/c;->a:Lb0/w1;

    .line 15
    .line 16
    iput-object p2, p0, Lod/c;->b:Lsd/b;

    .line 17
    .line 18
    iput-boolean p3, p0, Lod/c;->c:Z

    .line 19
    .line 20
    iget-object p1, p1, Lb0/w1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lod/a;

    .line 23
    .line 24
    iget-object p1, p1, Lod/a;->a:Lre/o;

    .line 25
    .line 26
    new-instance p2, Lbd/a;

    .line 27
    .line 28
    const/16 p3, 0xc

    .line 29
    .line 30
    invoke-direct {p2, p3, p0}, Lbd/a;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast p1, Lre/l;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lre/l;->c(Lic/k;)Lre/j;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lod/c;->d:Lre/j;

    .line 40
    .line 41
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final e(Lbe/c;)Lzc/b;
    .locals 3

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lod/c;->b:Lsd/b;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lsd/b;->a(Lbe/c;)Led/e;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Lod/c;->d:Lre/j;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lre/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lzc/b;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v1

    .line 26
    :cond_1
    :goto_0
    sget-object v1, Lmd/c;->a:Lbe/e;

    .line 27
    .line 28
    iget-object v1, p0, Lod/c;->a:Lb0/w1;

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, Lmd/c;->a(Lbe/c;Lsd/b;Lb0/w1;)Lnd/g;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
    .line 35
    .line 36
.end method

.method public final bridge f(Lbe/c;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lua/j;->m(Lzc/h;Lbe/c;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lod/c;->b:Lsd/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lsd/b;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
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

.method public final iterator()Ljava/util/Iterator;
    .locals 5

    .line 1
    iget-object v0, p0, Lod/c;->b:Lsd/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lsd/b;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {v1}, Lvb/m;->R(Ljava/lang/Iterable;)Ldf/n;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lod/c;->d:Lre/j;

    .line 14
    .line 15
    invoke-static {v1, v2}, Ldf/m;->e0(Ldf/k;Lic/k;)Ldf/r;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, Lmd/c;->a:Lbe/e;

    .line 20
    .line 21
    sget-object v2, Lvc/n;->m:Lbe/c;

    .line 22
    .line 23
    iget-object v3, p0, Lod/c;->a:Lb0/w1;

    .line 24
    .line 25
    invoke-static {v2, v0, v3}, Lmd/c;->a(Lbe/c;Lsd/b;Lb0/w1;)Lnd/g;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v2, Ldf/n;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v2, v3, v0}, Ldf/n;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    new-array v0, v0, [Ldf/k;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    aput-object v1, v0, v4

    .line 40
    .line 41
    aput-object v2, v0, v3

    .line 42
    .line 43
    invoke-static {v0}, Lvb/l;->d0([Ljava/lang/Object;)Ldf/k;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Ldf/m;->Z(Ldf/k;)Ldf/i;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Ld9/i;

    .line 52
    .line 53
    const/16 v2, 0xa

    .line 54
    .line 55
    invoke-direct {v1, v2}, Ld9/i;-><init>(I)V

    .line 56
    .line 57
    .line 58
    new-instance v2, Ldf/h;

    .line 59
    .line 60
    invoke-direct {v2, v0, v4, v1}, Ldf/h;-><init>(Ldf/k;ZLic/k;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Ldf/e;

    .line 64
    .line 65
    invoke-direct {v0, v2}, Ldf/e;-><init>(Ldf/h;)V

    .line 66
    .line 67
    .line 68
    return-object v0
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
.end method
