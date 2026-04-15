.class public final Lqe/t;
.super Lbd/d;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final k:Loe/k;

.field public final l:Lwd/y0;

.field public final m:Lqe/a;


# direct methods
.method public constructor <init>(Loe/k;Lwd/y0;I)V
    .locals 10

    .line 1
    iget-object v0, p1, Loe/k;->a:Loe/i;

    .line 2
    .line 3
    iget-object v2, v0, Loe/i;->a:Lre/l;

    .line 4
    .line 5
    iget-object v3, p1, Loe/k;->c:Lyc/k;

    .line 6
    .line 7
    iget-object v1, p1, Loe/k;->b:Lyd/f;

    .line 8
    .line 9
    iget v4, p2, Lwd/y0;->e:I

    .line 10
    .line 11
    invoke-static {v1, v4}, Lu3/x0;->r(Lyd/f;I)Lbe/e;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    iget-object v1, p2, Lwd/y0;->g:Lwd/x0;

    .line 16
    .line 17
    const-string v4, "getVariance(...)"

    .line 18
    .line 19
    invoke-static {v1, v4}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    if-eq v1, v4, :cond_1

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    if-ne v1, v4, :cond_0

    .line 33
    .line 34
    sget-object v1, Lse/x0;->c:Lse/x0;

    .line 35
    .line 36
    :goto_0
    move-object v6, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    new-instance p1, Lce/j0;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    sget-object v1, Lse/x0;->e:Lse/x0;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    sget-object v1, Lse/x0;->d:Lse/x0;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :goto_1
    iget-boolean v7, p2, Lwd/y0;->f:Z

    .line 51
    .line 52
    sget-object v9, Lyc/n0;->c:Lyc/n0;

    .line 53
    .line 54
    sget-object v4, Lzc/g;->a:Lzc/f;

    .line 55
    .line 56
    move-object v1, p0

    .line 57
    move v8, p3

    .line 58
    invoke-direct/range {v1 .. v9}, Lbd/d;-><init>(Lre/o;Lyc/k;Lzc/h;Lbe/e;Lse/x0;ZILyc/n0;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, v1, Lqe/t;->k:Loe/k;

    .line 62
    .line 63
    iput-object p2, v1, Lqe/t;->l:Lwd/y0;

    .line 64
    .line 65
    new-instance p1, Lqe/a;

    .line 66
    .line 67
    iget-object p2, v0, Loe/i;->a:Lre/l;

    .line 68
    .line 69
    new-instance p3, Lbd/e;

    .line 70
    .line 71
    const/16 v0, 0x10

    .line 72
    .line 73
    invoke-direct {p3, v0, p0}, Lbd/e;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {p1, p2, p3}, Lqe/a;-><init>(Lre/o;Lic/a;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, v1, Lqe/t;->m:Lqe/a;

    .line 80
    .line 81
    return-void
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
.method public final E1()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lqe/t;->k:Loe/k;

    .line 2
    .line 3
    iget-object v1, v0, Loe/k;->d:Lbd/f0;

    .line 4
    .line 5
    iget-object v2, p0, Lqe/t;->l:Lwd/y0;

    .line 6
    .line 7
    invoke-static {v2, v1}, Lud/e;->h0(Lwd/y0;Lbd/f0;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lie/d;->e(Lyc/k;)Lvc/i;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lvc/i;->o()Lse/a0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    check-cast v1, Ljava/lang/Iterable;

    .line 31
    .line 32
    iget-object v0, v0, Loe/k;->h:Lid/h;

    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v3, 0xa

    .line 37
    .line 38
    invoke-static {v1, v3}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lwd/t0;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lid/h;->s(Lwd/t0;)Lse/w;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    return-object v2
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

.method public final getAnnotations()Lzc/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lqe/t;->m:Lqe/a;

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
