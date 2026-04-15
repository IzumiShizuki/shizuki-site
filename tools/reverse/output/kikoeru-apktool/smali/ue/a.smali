.class public final Lue/a;
.super Lbd/n;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# direct methods
.method public constructor <init>(Lbe/e;)V
    .locals 15

    .line 1
    sget-object v0, Lue/l;->a:Lue/l;

    .line 2
    .line 3
    sget-object v2, Lue/l;->b:Lue/e;

    .line 4
    .line 5
    sget-object v7, Lre/l;->e:Lre/b;

    .line 6
    .line 7
    sget-object v4, Lyc/x;->d:Lyc/x;

    .line 8
    .line 9
    sget-object v5, Lyc/f;->a:Lyc/f;

    .line 10
    .line 11
    sget-object v6, Lvb/r;->a:Lvb/r;

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    move-object/from16 v3, p1

    .line 15
    .line 16
    invoke-direct/range {v1 .. v7}, Lbd/n;-><init>(Lyc/k;Lbe/e;Lyc/x;Lyc/f;Ljava/util/Collection;Lre/o;)V

    .line 17
    .line 18
    .line 19
    new-instance v8, Lbd/l;

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v13, 0x1

    .line 23
    sget-object v11, Lzc/g;->a:Lzc/f;

    .line 24
    .line 25
    const/4 v12, 0x1

    .line 26
    sget-object v14, Lyc/m0;->p0:Lyc/n0;

    .line 27
    .line 28
    move-object v9, p0

    .line 29
    invoke-direct/range {v8 .. v14}, Lbd/l;-><init>(Lyc/e;Lyc/j;Lzc/h;ZILyc/m0;)V

    .line 30
    .line 31
    .line 32
    move-object v0, v8

    .line 33
    sget-object v2, Lyc/o;->e:Lld/o;

    .line 34
    .line 35
    invoke-virtual {v0, v6, v2}, Lbd/l;->R1(Ljava/util/List;Lld/o;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lbd/p;->getName()Lbe/e;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v2, v2, Lbe/e;->a:Ljava/lang/String;

    .line 43
    .line 44
    const-string v3, "toString(...)"

    .line 45
    .line 46
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v3, ""

    .line 50
    .line 51
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, Lue/h;->f:Lue/h;

    .line 56
    .line 57
    invoke-static {v3, v2}, Lue/l;->b(Lue/h;[Ljava/lang/String;)Lue/g;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    new-instance v8, Lue/i;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    new-array v3, v2, [Ljava/lang/String;

    .line 65
    .line 66
    sget-object v11, Lue/k;->v:Lue/k;

    .line 67
    .line 68
    invoke-static {v11, v3}, Lue/l;->d(Lue/k;[Ljava/lang/String;)Lue/j;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    new-array v14, v2, [Ljava/lang/String;

    .line 73
    .line 74
    const/4 v13, 0x0

    .line 75
    move-object v12, v6

    .line 76
    invoke-direct/range {v8 .. v14}, Lue/i;-><init>(Lse/k0;Lue/g;Lue/k;Ljava/util/List;Z[Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iput-object v8, v0, Lbd/z;->g:Lse/w;

    .line 80
    .line 81
    invoke-static {v0}, Lud/e;->X(Ljava/lang/Object;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {p0, v10, v2, v0}, Lbd/n;->q(Lle/o;Ljava/util/Set;Lbd/l;)V

    .line 86
    .line 87
    .line 88
    return-void
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


# virtual methods
.method public final c(Lse/p0;Lte/f;)Lle/o;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbd/c;->getName()Lbe/e;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p2, p2, Lbe/e;->a:Ljava/lang/String;

    .line 6
    .line 7
    const-string v0, "toString(...)"

    .line 8
    .line 9
    invoke-static {p2, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    filled-new-array {p2, p1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lue/h;->f:Lue/h;

    .line 21
    .line 22
    invoke-static {p2, p1}, Lue/l;->b(Lue/h;[Ljava/lang/String;)Lue/g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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

.method public final h(Lse/r0;)Lyc/l;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public final o(Lse/r0;)Lyc/e;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbd/c;->getName()Lbe/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbe/e;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "asString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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
