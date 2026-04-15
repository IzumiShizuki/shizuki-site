.class public final Lu/n0;
.super Lu/k0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public A:Z

.field public B:Lic/o;

.field public C:Lic/o;

.field public D:Z

.field public y:Lu/o0;

.field public z:Lu/e1;


# virtual methods
.method public final I0(Lu/j0;Lu/j0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lu/n0;->y:Lu/o0;

    .line 2
    .line 3
    new-instance v1, Lq/q;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xb

    .line 7
    .line 8
    invoke-direct {v1, p1, p0, v2, v3}, Lq/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Ls/v0;->b:Ls/v0;

    .line 12
    .line 13
    invoke-interface {v0, p1, v1, p2}, Lu/o0;->d(Ls/v0;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 18
    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 23
    .line 24
    return-object p1
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

.method public final J0(J)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lj1/p;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lu/n0;->B:Lic/o;

    .line 6
    .line 7
    sget-object v1, Lu/l0;->a:Li7/k;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lj1/p;->n0()Lhf/y;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lu/m0;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    move-object v2, p0

    .line 25
    move-wide v3, p1

    .line 26
    invoke-direct/range {v1 .. v6}, Lu/m0;-><init>(Lu/n0;JLyb/c;I)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    sget-object p2, Lhf/z;->d:Lhf/z;

    .line 31
    .line 32
    invoke-static {v0, v5, p2, v1, p1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
    .line 36
.end method

.method public final K0(J)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lj1/p;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lu/n0;->C:Lic/o;

    .line 6
    .line 7
    sget-object v1, Lu/l0;->b:Li7/k;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lj1/p;->n0()Lhf/y;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lu/m0;

    .line 21
    .line 22
    const/4 v6, 0x1

    .line 23
    const/4 v5, 0x0

    .line 24
    move-object v2, p0

    .line 25
    move-wide v3, p1

    .line 26
    invoke-direct/range {v1 .. v6}, Lu/m0;-><init>(Lu/n0;JLyb/c;I)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    sget-object p2, Lhf/z;->d:Lhf/z;

    .line 31
    .line 32
    invoke-static {v0, v5, p2, v1, p1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
    .line 36
.end method

.method public final L0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu/n0;->A:Z

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
