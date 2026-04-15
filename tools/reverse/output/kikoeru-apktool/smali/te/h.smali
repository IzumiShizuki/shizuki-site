.class public final Lte/h;
.super Lse/a0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lve/c;


# instance fields
.field public final b:Lve/b;

.field public final c:Lte/i;

.field public final d:Lse/w0;

.field public final e:Lse/h0;

.field public final f:Z

.field public final g:Z


# direct methods
.method public constructor <init>(Lve/b;Lte/i;Lse/w0;Lse/h0;ZI)V
    .locals 7

    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_0

    .line 8
    sget-object p4, Lse/h0;->b:Lm0/w;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    sget-object p4, Lse/h0;->c:Lse/h0;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    move v5, p5

    :goto_0
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 10
    invoke-direct/range {v0 .. v6}, Lte/h;-><init>(Lve/b;Lte/i;Lse/w0;Lse/h0;ZZ)V

    return-void
.end method

.method public constructor <init>(Lve/b;Lte/i;Lse/w0;Lse/h0;ZZ)V
    .locals 1

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lte/h;->b:Lve/b;

    .line 3
    iput-object p2, p0, Lte/h;->c:Lte/i;

    .line 4
    iput-object p3, p0, Lte/h;->d:Lse/w0;

    .line 5
    iput-object p4, p0, Lte/h;->e:Lse/h0;

    .line 6
    iput-boolean p5, p0, Lte/h;->f:Z

    .line 7
    iput-boolean p6, p0, Lte/h;->g:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic B(Lte/f;)Lse/w0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lte/h;->G(Lte/f;)Lte/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final D(Z)Lse/a0;
    .locals 7

    .line 1
    new-instance v0, Lte/h;

    .line 2
    .line 3
    iget-object v4, p0, Lte/h;->e:Lse/h0;

    .line 4
    .line 5
    const/16 v6, 0x20

    .line 6
    .line 7
    iget-object v1, p0, Lte/h;->b:Lve/b;

    .line 8
    .line 9
    iget-object v2, p0, Lte/h;->c:Lte/i;

    .line 10
    .line 11
    iget-object v3, p0, Lte/h;->d:Lse/w0;

    .line 12
    .line 13
    move v5, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lte/h;-><init>(Lve/b;Lte/i;Lse/w0;Lse/h0;ZI)V

    .line 15
    .line 16
    .line 17
    return-object v0
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

.method public final F(Lse/h0;)Lse/a0;
    .locals 8

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lte/h;

    .line 7
    .line 8
    iget-boolean v6, p0, Lte/h;->f:Z

    .line 9
    .line 10
    iget-boolean v7, p0, Lte/h;->g:Z

    .line 11
    .line 12
    iget-object v2, p0, Lte/h;->b:Lve/b;

    .line 13
    .line 14
    iget-object v3, p0, Lte/h;->c:Lte/i;

    .line 15
    .line 16
    iget-object v4, p0, Lte/h;->d:Lse/w0;

    .line 17
    .line 18
    move-object v5, p1

    .line 19
    invoke-direct/range {v1 .. v7}, Lte/h;-><init>(Lve/b;Lte/i;Lse/w0;Lse/h0;ZZ)V

    .line 20
    .line 21
    .line 22
    return-object v1
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

.method public final G(Lte/f;)Lte/h;
    .locals 11

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lte/h;->c:Lte/i;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lte/i;->a:Lse/n0;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lse/n0;->d(Lte/f;)Lse/n0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v0, Lte/i;->b:Lic/a;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance v2, Lbd/i;

    .line 23
    .line 24
    const/16 v4, 0x12

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-direct {v2, v4, v0, p1, v5}, Lbd/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v2, v3

    .line 32
    :goto_0
    iget-object p1, v0, Lte/i;->c:Lte/i;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    move-object p1, v0

    .line 37
    :cond_1
    iget-object v0, v0, Lte/i;->d:Lyc/q0;

    .line 38
    .line 39
    new-instance v6, Lte/i;

    .line 40
    .line 41
    invoke-direct {v6, v1, v2, p1, v0}, Lte/i;-><init>(Lse/n0;Lic/a;Lte/i;Lyc/q0;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lte/h;->d:Lse/w0;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    move-object v7, p1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object v7, v3

    .line 51
    :goto_1
    new-instance v4, Lte/h;

    .line 52
    .line 53
    iget-object v5, p0, Lte/h;->b:Lve/b;

    .line 54
    .line 55
    iget-object v8, p0, Lte/h;->e:Lse/h0;

    .line 56
    .line 57
    iget-boolean v9, p0, Lte/h;->f:Z

    .line 58
    .line 59
    const/16 v10, 0x20

    .line 60
    .line 61
    invoke-direct/range {v4 .. v10}, Lte/h;-><init>(Lve/b;Lte/i;Lse/w0;Lse/h0;ZI)V

    .line 62
    .line 63
    .line 64
    return-object v4
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
.end method

.method public final n0()Lle/o;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    sget-object v1, Lue/h;->b:Lue/h;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v1, v2, v0}, Lue/l;->a(Lue/h;Z[Ljava/lang/String;)Lue/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public final q()Ljava/util/List;
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

.method public final r()Lse/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Lte/h;->e:Lse/h0;

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

.method public final t()Lse/k0;
    .locals 1

    .line 1
    iget-object v0, p0, Lte/h;->c:Lte/i;

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

.method public final u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lte/h;->f:Z

    .line 2
    .line 3
    return v0
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

.method public final bridge synthetic v(Lte/f;)Lse/w;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lte/h;->G(Lte/f;)Lte/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final z(Z)Lse/w0;
    .locals 7

    .line 1
    new-instance v0, Lte/h;

    .line 2
    .line 3
    iget-object v4, p0, Lte/h;->e:Lse/h0;

    .line 4
    .line 5
    const/16 v6, 0x20

    .line 6
    .line 7
    iget-object v1, p0, Lte/h;->b:Lve/b;

    .line 8
    .line 9
    iget-object v2, p0, Lte/h;->c:Lte/i;

    .line 10
    .line 11
    iget-object v3, p0, Lte/h;->d:Lse/w0;

    .line 12
    .line 13
    move v5, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lte/h;-><init>(Lve/b;Lte/i;Lse/w0;Lse/h0;ZI)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
