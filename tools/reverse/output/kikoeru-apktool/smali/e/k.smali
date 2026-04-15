.class public final Le/k;
.super Ld/b0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public d:Lhf/y;

.field public e:Lic/n;

.field public f:Lb7/n;

.field public g:Z


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/k;->f:Lb7/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lb7/n;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Le/k;->f:Lb7/n;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iput-boolean v1, v0, Lb7/n;->b:Z

    .line 14
    .line 15
    :cond_1
    iput-boolean v1, p0, Le/k;->g:Z

    .line 16
    .line 17
    return-void
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

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Le/k;->f:Lb7/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v2, v0, Lb7/n;->b:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lb7/n;->c()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Le/k;->f:Lb7/n;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Le/k;->f:Lb7/n;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Lb7/n;

    .line 21
    .line 22
    iget-object v3, p0, Le/k;->d:Lhf/y;

    .line 23
    .line 24
    iget-object v4, p0, Le/k;->e:Lic/n;

    .line 25
    .line 26
    invoke-direct {v0, v3, v2, v4, p0}, Lb7/n;-><init>(Lhf/y;ZLic/n;Le/k;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Le/k;->f:Lb7/n;

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Le/k;->f:Lb7/n;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lb7/n;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lkf/f;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lkf/f;->k(Ljava/lang/Throwable;)Z

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Le/k;->f:Lb7/n;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    iput-boolean v2, v0, Lb7/n;->b:Z

    .line 47
    .line 48
    :cond_3
    iput-boolean v2, p0, Le/k;->g:Z

    .line 49
    .line 50
    return-void
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
.end method

.method public final c(Ld/c;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Ld/b0;->c(Ld/c;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le/k;->f:Lb7/n;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lb7/n;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lkf/f;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lkf/u;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
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

.method public final d(Ld/c;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ld/b0;->d(Ld/c;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Le/k;->f:Lb7/n;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lb7/n;->c()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean p1, p0, Ld/b0;->a:Z

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance p1, Lb7/n;

    .line 17
    .line 18
    iget-object v1, p0, Le/k;->d:Lhf/y;

    .line 19
    .line 20
    iget-object v2, p0, Le/k;->e:Lic/n;

    .line 21
    .line 22
    invoke-direct {p1, v1, v0, v2, p0}, Lb7/n;-><init>(Lhf/y;ZLic/n;Le/k;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Le/k;->f:Lb7/n;

    .line 26
    .line 27
    :cond_1
    iput-boolean v0, p0, Le/k;->g:Z

    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
