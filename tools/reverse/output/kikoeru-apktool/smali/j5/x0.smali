.class public final Lj5/x0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ll0/l;
.implements Lm6/g;


# instance fields
.field public a:J

.field public b:J

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JI)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p0, Lj5/x0;->c:Ljava/lang/Object;

    check-cast v0, Ln5/a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 3
    iput-wide p1, p0, Lj5/x0;->a:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    .line 4
    iput-wide p1, p0, Lj5/x0;->b:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BJJ)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lj5/x0;->c:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, Lj5/x0;->d:Ljava/lang/Object;

    .line 8
    iput-wide p3, p0, Lj5/x0;->a:J

    .line 9
    iput-wide p5, p0, Lj5/x0;->b:J

    return-void
.end method


# virtual methods
.method public c(JLl0/s;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lj5/x0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk0/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lk0/g;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lg2/c0;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v1, p0, Lj5/x0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ll0/y0;

    .line 16
    .line 17
    iget-wide v2, p0, Lj5/x0;->b:J

    .line 18
    .line 19
    invoke-interface {v0}, Lg2/c0;->h()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    check-cast v1, Ll0/a1;

    .line 27
    .line 28
    iget-object v4, v1, Ll0/a1;->f:Lk1/o;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    .line 34
    new-instance v6, Lp1/b;

    .line 35
    .line 36
    invoke-direct {v6, p1, p2}, Lp1/b;-><init>(J)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v5, v0, v6, p3}, Lk1/o;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    iput-wide p1, p0, Lj5/x0;->a:J

    .line 43
    .line 44
    invoke-static {v1, v2, v3}, Ll0/b1;->a(Ll0/y0;J)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 50
    return p1
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public d(Lr5/o;)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lj5/x0;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    const-wide/16 v4, -0x1

    .line 6
    .line 7
    cmp-long p1, v0, v2

    .line 8
    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    const-wide/16 v2, 0x2

    .line 12
    .line 13
    add-long/2addr v0, v2

    .line 14
    neg-long v0, v0

    .line 15
    iput-wide v4, p0, Lj5/x0;->b:J

    .line 16
    .line 17
    return-wide v0

    .line 18
    :cond_0
    return-wide v4
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

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/x0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll0/y0;

    .line 4
    .line 5
    check-cast v0, Ll0/a1;

    .line 6
    .line 7
    iget-object v0, v0, Ll0/a1;->h:Ll0/x;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ll0/x;->b()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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

.method public i(JLl0/s;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lj5/x0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk0/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lk0/g;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lg2/c0;

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lj5/x0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ll0/y0;

    .line 17
    .line 18
    iget-wide v3, p0, Lj5/x0;->b:J

    .line 19
    .line 20
    invoke-interface {v2}, Lg2/c0;->h()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v0, v3, v4}, Ll0/b1;->a(Ll0/y0;J)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    :goto_0
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :cond_1
    iget-wide v5, p0, Lj5/x0;->a:J

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Ll0/a1;

    .line 40
    .line 41
    move-wide v3, p1

    .line 42
    move-object v7, p3

    .line 43
    invoke-virtual/range {v1 .. v8}, Ll0/a1;->b(Lg2/c0;JJLl0/s;Z)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iput-wide v3, p0, Lj5/x0;->a:J

    .line 50
    .line 51
    :cond_2
    const/4 p1, 0x1

    .line 52
    return p1
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public j()Lr5/b0;
    .locals 5

    .line 1
    iget-wide v0, p0, Lj5/x0;->a:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-eqz v4, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lr5/s;

    .line 16
    .line 17
    iget-object v1, p0, Lj5/x0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lr5/t;

    .line 20
    .line 21
    iget-wide v2, p0, Lj5/x0;->a:J

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v0, v1, v2, v3, v4}, Lr5/s;-><init>(Ljava/lang/Object;JI)V

    .line 25
    .line 26
    .line 27
    return-object v0
    .line 28
    .line 29
.end method

.method public m(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj5/x0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0/w;

    .line 4
    .line 5
    iget-object v0, v0, Lm0/w;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, [J

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {v0, p1, p2, v1}, Lp4/c0;->e([JJZ)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    aget-wide p1, v0, p1

    .line 15
    .line 16
    iput-wide p1, p0, Lj5/x0;->b:J

    .line 17
    .line 18
    return-void
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
