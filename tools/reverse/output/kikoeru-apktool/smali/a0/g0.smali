.class public final La0/g0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lu/v1;


# static fields
.field public static final w:Landroidx/media3/exoplayer/offline/u;


# instance fields
.field public final a:La0/a;

.field public b:Z

.field public c:La0/t;

.field public final d:La0/v;

.field public final e:Lx0/e1;

.field public final f:Lw/k;

.field public g:F

.field public final h:Lu/k;

.field public final i:Z

.field public j:Li2/j0;

.field public final k:La0/b0;

.field public final l:Lb0/e;

.field public final m:Landroidx/compose/foundation/lazy/layout/b;

.field public final n:Lb0/m;

.field public final o:Lb0/z0;

.field public final p:La0/z;

.field public final q:Lb0/w0;

.field public final r:Lx0/w0;

.field public final s:Lx0/e1;

.field public final t:Lx0/e1;

.field public final u:Lx0/w0;

.field public final v:Lb0/c1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La0/x;->b:La0/x;

    .line 2
    .line 3
    sget-object v1, La0/r;->e:La0/r;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lg1/l;->b(Lic/n;Lic/k;)Landroidx/media3/exoplayer/offline/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, La0/g0;->w:Landroidx/media3/exoplayer/offline/u;

    .line 10
    .line 11
    return-void
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

.method public constructor <init>(II)V
    .locals 3

    .line 1
    new-instance v0, La0/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, La0/a;->a:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La0/g0;->a:La0/a;

    .line 13
    .line 14
    new-instance v0, La0/v;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lx0/b1;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Lx0/b1;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, La0/v;->b:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance v1, Lx0/b1;

    .line 27
    .line 28
    invoke-direct {v1, p2}, Lx0/b1;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, La0/v;->c:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance p2, Lb0/u0;

    .line 34
    .line 35
    const/16 v1, 0x1e

    .line 36
    .line 37
    const/16 v2, 0x64

    .line 38
    .line 39
    invoke-direct {p2, p1, v1, v2}, Lb0/u0;-><init>(III)V

    .line 40
    .line 41
    .line 42
    iput-object p2, v0, La0/v;->e:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object v0, p0, La0/g0;->d:La0/v;

    .line 45
    .line 46
    sget-object p2, La0/j0;->a:La0/t;

    .line 47
    .line 48
    sget-object v0, Lx0/r0;->c:Lx0/r0;

    .line 49
    .line 50
    new-instance v1, Lx0/e1;

    .line 51
    .line 52
    invoke-direct {v1, p2, v0}, Lx0/e1;-><init>(Ljava/lang/Object;Lx0/i2;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, La0/g0;->e:Lx0/e1;

    .line 56
    .line 57
    new-instance p2, Lw/k;

    .line 58
    .line 59
    invoke-direct {p2}, Lw/k;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p2, p0, La0/g0;->f:Lw/k;

    .line 63
    .line 64
    new-instance p2, La0/f0;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-direct {p2, v0, p0}, La0/f0;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lu/k;

    .line 71
    .line 72
    invoke-direct {v0, p2}, Lu/k;-><init>(Lic/k;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, La0/g0;->h:Lu/k;

    .line 76
    .line 77
    const/4 p2, 0x1

    .line 78
    iput-boolean p2, p0, La0/g0;->i:Z

    .line 79
    .line 80
    new-instance p2, La0/b0;

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    invoke-direct {p2, p0, v0}, La0/b0;-><init>(Lu/v1;I)V

    .line 84
    .line 85
    .line 86
    iput-object p2, p0, La0/g0;->k:La0/b0;

    .line 87
    .line 88
    new-instance p2, Lb0/e;

    .line 89
    .line 90
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p2, p0, La0/g0;->l:Lb0/e;

    .line 94
    .line 95
    new-instance p2, Landroidx/compose/foundation/lazy/layout/b;

    .line 96
    .line 97
    invoke-direct {p2}, Landroidx/compose/foundation/lazy/layout/b;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, p0, La0/g0;->m:Landroidx/compose/foundation/lazy/layout/b;

    .line 101
    .line 102
    new-instance p2, Lb0/m;

    .line 103
    .line 104
    invoke-direct {p2, v0}, Lb0/m;-><init>(I)V

    .line 105
    .line 106
    .line 107
    iput-object p2, p0, La0/g0;->n:Lb0/m;

    .line 108
    .line 109
    new-instance p2, Lb0/z0;

    .line 110
    .line 111
    new-instance v0, La0/a0;

    .line 112
    .line 113
    invoke-direct {v0, p0, p1}, La0/a0;-><init>(La0/g0;I)V

    .line 114
    .line 115
    .line 116
    invoke-direct {p2, v0}, Lb0/z0;-><init>(Lic/k;)V

    .line 117
    .line 118
    .line 119
    iput-object p2, p0, La0/g0;->o:Lb0/z0;

    .line 120
    .line 121
    new-instance p1, La0/z;

    .line 122
    .line 123
    invoke-direct {p1, p0}, La0/z;-><init>(La0/g0;)V

    .line 124
    .line 125
    .line 126
    iput-object p1, p0, La0/g0;->p:La0/z;

    .line 127
    .line 128
    new-instance p1, Lb0/w0;

    .line 129
    .line 130
    invoke-direct {p1}, Lb0/w0;-><init>()V

    .line 131
    .line 132
    .line 133
    iput-object p1, p0, La0/g0;->q:Lb0/w0;

    .line 134
    .line 135
    invoke-static {}, Lb0/g0;->g()Lx0/w0;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object p1, p0, La0/g0;->r:Lx0/w0;

    .line 140
    .line 141
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    iput-object p2, p0, La0/g0;->s:Lx0/e1;

    .line 148
    .line 149
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iput-object p1, p0, La0/g0;->t:Lx0/e1;

    .line 154
    .line 155
    invoke-static {}, Lb0/g0;->g()Lx0/w0;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iput-object p1, p0, La0/g0;->u:Lx0/w0;

    .line 160
    .line 161
    new-instance p1, Lb0/c1;

    .line 162
    .line 163
    const/4 p2, 0x0

    .line 164
    invoke-direct {p1, p2}, Lb0/c1;-><init>(I)V

    .line 165
    .line 166
    .line 167
    iput-object p1, p0, La0/g0;->v:Lb0/c1;

    .line 168
    .line 169
    return-void
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, La0/g0;->h:Lu/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu/k;->a()Z

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

.method public final b(Ls/v0;Lic/n;Lac/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La0/e0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La0/e0;

    .line 7
    .line 8
    iget v1, v0, La0/e0;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La0/e0;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La0/e0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La0/e0;-><init>(La0/g0;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La0/e0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, La0/e0;->i:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    iget-object p1, v0, La0/e0;->f:Lac/i;

    .line 52
    .line 53
    move-object p2, p1

    .line 54
    check-cast p2, Lic/n;

    .line 55
    .line 56
    iget-object p1, v0, La0/e0;->e:Ls/v0;

    .line 57
    .line 58
    iget-object v1, v0, La0/e0;->d:La0/g0;

    .line 59
    .line 60
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p3}, Lub/a;->f(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object p0, v0, La0/e0;->d:La0/g0;

    .line 68
    .line 69
    iput-object p1, v0, La0/e0;->e:Ls/v0;

    .line 70
    .line 71
    move-object p3, p2

    .line 72
    check-cast p3, Lac/i;

    .line 73
    .line 74
    iput-object p3, v0, La0/e0;->f:Lac/i;

    .line 75
    .line 76
    iput v3, v0, La0/e0;->i:I

    .line 77
    .line 78
    iget-object p3, p0, La0/g0;->l:Lb0/e;

    .line 79
    .line 80
    invoke-virtual {p3, v0}, Lb0/e;->h(Lac/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    if-ne p3, v4, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v1, p0

    .line 88
    :goto_1
    iget-object p3, v1, La0/g0;->h:Lu/k;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    iput-object v1, v0, La0/e0;->d:La0/g0;

    .line 92
    .line 93
    iput-object v1, v0, La0/e0;->e:Ls/v0;

    .line 94
    .line 95
    iput-object v1, v0, La0/e0;->f:Lac/i;

    .line 96
    .line 97
    iput v2, v0, La0/e0;->i:I

    .line 98
    .line 99
    invoke-virtual {p3, p1, p2, v0}, Lu/k;->b(Ls/v0;Lic/n;Lac/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v4, :cond_5

    .line 104
    .line 105
    :goto_2
    return-object v4

    .line 106
    :cond_5
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 107
    .line 108
    return-object p1
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, La0/g0;->t:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
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

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, La0/g0;->s:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
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

.method public final e(F)F
    .locals 1

    .line 1
    iget-object v0, p0, La0/g0;->h:Lu/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu/k;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public final f(La0/t;ZZ)V
    .locals 9

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, La0/g0;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, La0/g0;->c:La0/t;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iput-boolean v0, p0, La0/g0;->b:Z

    .line 14
    .line 15
    :cond_1
    iget-object v1, p1, La0/t;->a:La0/u;

    .line 16
    .line 17
    iget-object v2, p1, La0/t;->k:Ljava/lang/Object;

    .line 18
    .line 19
    iget v3, p1, La0/t;->b:I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget v5, v1, La0/u;->a:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    const/4 v5, 0x0

    .line 28
    :goto_0
    if-nez v5, :cond_4

    .line 29
    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    const/4 v5, 0x0

    .line 34
    goto :goto_2

    .line 35
    :cond_4
    :goto_1
    const/4 v5, 0x1

    .line 36
    :goto_2
    iget-object v6, p0, La0/g0;->t:Lx0/e1;

    .line 37
    .line 38
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v6, v5}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v5, p1, La0/t;->c:Z

    .line 46
    .line 47
    iget-object v6, p0, La0/g0;->s:Lx0/e1;

    .line 48
    .line 49
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v6, v5}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget v5, p0, La0/g0;->g:F

    .line 57
    .line 58
    iget v6, p1, La0/t;->d:F

    .line 59
    .line 60
    sub-float/2addr v5, v6

    .line 61
    iput v5, p0, La0/g0;->g:F

    .line 62
    .line 63
    iget-object v5, p0, La0/g0;->e:Lx0/e1;

    .line 64
    .line 65
    invoke-virtual {v5, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const-string v5, "scrollOffset should be non-negative"

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    iget-object v7, p0, La0/g0;->d:La0/v;

    .line 72
    .line 73
    if-eqz p3, :cond_7

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    int-to-float p3, v3

    .line 79
    cmpl-float p3, p3, v6

    .line 80
    .line 81
    if-ltz p3, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    const/4 v0, 0x0

    .line 85
    :goto_3
    if-nez v0, :cond_6

    .line 86
    .line 87
    invoke-static {v5}, Lx/a;->c(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    iget-object p3, v7, La0/v;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p3, Lx0/b1;

    .line 93
    .line 94
    invoke-virtual {p3, v3}, Lx0/b1;->f(I)V

    .line 95
    .line 96
    .line 97
    goto :goto_7

    .line 98
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/4 p3, 0x0

    .line 102
    if-eqz v1, :cond_8

    .line 103
    .line 104
    iget-object v8, v1, La0/u;->i:Ljava/lang/Object;

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_8
    move-object v8, p3

    .line 108
    :goto_4
    iput-object v8, v7, La0/v;->d:Ljava/lang/Object;

    .line 109
    .line 110
    iget-boolean v8, v7, La0/v;->a:Z

    .line 111
    .line 112
    if-nez v8, :cond_9

    .line 113
    .line 114
    iget v8, p1, La0/t;->n:I

    .line 115
    .line 116
    if-lez v8, :cond_d

    .line 117
    .line 118
    :cond_9
    iput-boolean v0, v7, La0/v;->a:Z

    .line 119
    .line 120
    int-to-float v8, v3

    .line 121
    cmpl-float v6, v8, v6

    .line 122
    .line 123
    if-ltz v6, :cond_a

    .line 124
    .line 125
    const/4 v6, 0x1

    .line 126
    goto :goto_5

    .line 127
    :cond_a
    const/4 v6, 0x0

    .line 128
    :goto_5
    if-nez v6, :cond_b

    .line 129
    .line 130
    invoke-static {v5}, Lx/a;->c(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_b
    if-eqz v1, :cond_c

    .line 134
    .line 135
    iget v4, v1, La0/u;->a:I

    .line 136
    .line 137
    :cond_c
    invoke-virtual {v7, v4, v3}, La0/v;->q(II)V

    .line 138
    .line 139
    .line 140
    :cond_d
    iget-boolean v1, p0, La0/g0;->i:Z

    .line 141
    .line 142
    if-eqz v1, :cond_10

    .line 143
    .line 144
    iget-object v1, p0, La0/g0;->a:La0/a;

    .line 145
    .line 146
    iget v3, v1, La0/a;->a:I

    .line 147
    .line 148
    const/4 v4, -0x1

    .line 149
    if-eq v3, v4, :cond_10

    .line 150
    .line 151
    move-object v3, v2

    .line 152
    check-cast v3, Ljava/util/Collection;

    .line 153
    .line 154
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-nez v3, :cond_10

    .line 159
    .line 160
    iget-boolean v3, v1, La0/a;->b:Z

    .line 161
    .line 162
    if-eqz v3, :cond_e

    .line 163
    .line 164
    invoke-static {v2}, Lvb/m;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, La0/u;

    .line 169
    .line 170
    iget v2, v2, La0/u;->a:I

    .line 171
    .line 172
    add-int/2addr v2, v0

    .line 173
    goto :goto_6

    .line 174
    :cond_e
    invoke-static {v2}, Lvb/m;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, La0/u;

    .line 179
    .line 180
    iget v2, v2, La0/u;->a:I

    .line 181
    .line 182
    sub-int/2addr v2, v0

    .line 183
    :goto_6
    iget v0, v1, La0/a;->a:I

    .line 184
    .line 185
    if-eq v0, v2, :cond_10

    .line 186
    .line 187
    iput v4, v1, La0/a;->a:I

    .line 188
    .line 189
    iget-object v0, v1, La0/a;->c:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lb0/y0;

    .line 192
    .line 193
    if-eqz v0, :cond_f

    .line 194
    .line 195
    invoke-interface {v0}, Lb0/y0;->cancel()V

    .line 196
    .line 197
    .line 198
    :cond_f
    iput-object p3, v1, La0/a;->c:Ljava/lang/Object;

    .line 199
    .line 200
    :cond_10
    :goto_7
    if-eqz p2, :cond_11

    .line 201
    .line 202
    iget p2, p1, La0/t;->f:F

    .line 203
    .line 204
    iget-object p3, p1, La0/t;->i:Lf3/c;

    .line 205
    .line 206
    iget-object p1, p1, La0/t;->h:Lhf/y;

    .line 207
    .line 208
    iget-object v0, p0, La0/g0;->v:Lb0/c1;

    .line 209
    .line 210
    invoke-virtual {v0, p2, p3, p1}, Lb0/c1;->I(FLf3/c;Lhf/y;)V

    .line 211
    .line 212
    .line 213
    :cond_11
    return-void
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method

.method public final g()La0/t;
    .locals 1

    .line 1
    iget-object v0, p0, La0/g0;->e:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La0/t;

    .line 8
    .line 9
    return-object v0
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

.method public final h(FLa0/t;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, La0/g0;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p2, La0/t;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, p2, La0/t;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_6

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    cmpg-float v0, p1, v0

    .line 20
    .line 21
    if-gez v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {v1}, Lvb/m;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, La0/u;

    .line 33
    .line 34
    iget v3, v3, La0/u;->a:I

    .line 35
    .line 36
    add-int/2addr v3, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {v1}, Lvb/m;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, La0/u;

    .line 43
    .line 44
    iget v3, v3, La0/u;->a:I

    .line 45
    .line 46
    sub-int/2addr v3, v2

    .line 47
    :goto_1
    if-ltz v3, :cond_6

    .line 48
    .line 49
    iget v2, p2, La0/t;->n:I

    .line 50
    .line 51
    if-ge v3, v2, :cond_6

    .line 52
    .line 53
    iget-object v2, p0, La0/g0;->a:La0/a;

    .line 54
    .line 55
    iget v4, v2, La0/a;->a:I

    .line 56
    .line 57
    if-eq v3, v4, :cond_4

    .line 58
    .line 59
    iget-boolean v4, v2, La0/a;->b:Z

    .line 60
    .line 61
    if-eq v4, v0, :cond_2

    .line 62
    .line 63
    iget-object v4, v2, La0/a;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, Lb0/y0;

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    invoke-interface {v4}, Lb0/y0;->cancel()V

    .line 70
    .line 71
    .line 72
    :cond_2
    iput-boolean v0, v2, La0/a;->b:Z

    .line 73
    .line 74
    iput v3, v2, La0/a;->a:I

    .line 75
    .line 76
    iget-object v4, p0, La0/g0;->p:La0/z;

    .line 77
    .line 78
    iget-object v4, v4, La0/z;->a:La0/g0;

    .line 79
    .line 80
    invoke-static {}, Lh1/t;->d()Lh1/g;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    invoke-virtual {v5}, Lh1/g;->e()Lic/k;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    const/4 v6, 0x0

    .line 92
    :goto_2
    invoke-static {v5}, Lh1/t;->g(Lh1/g;)Lh1/g;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    :try_start_0
    iget-object v8, v4, La0/g0;->e:Lx0/e1;

    .line 97
    .line 98
    invoke-virtual {v8}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    check-cast v8, La0/t;

    .line 103
    .line 104
    iget-wide v8, v8, La0/t;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    invoke-static {v5, v7, v6}, Lh1/t;->k(Lh1/g;Lh1/g;Lic/k;)V

    .line 107
    .line 108
    .line 109
    iget-object v4, v4, La0/g0;->o:Lb0/z0;

    .line 110
    .line 111
    invoke-virtual {v4, v3, v8, v9}, Lb0/z0;->a(IJ)Lb0/y0;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    iput-object v3, v2, La0/a;->c:Ljava/lang/Object;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    invoke-static {v5, v7, v6}, Lh1/t;->k(Lh1/g;Lh1/g;Lic/k;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_4
    :goto_3
    if-eqz v0, :cond_5

    .line 124
    .line 125
    invoke-static {v1}, Lvb/m;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, La0/u;

    .line 130
    .line 131
    iget v1, p2, La0/t;->q:I

    .line 132
    .line 133
    iget v3, v0, La0/u;->m:I

    .line 134
    .line 135
    iget v0, v0, La0/u;->n:I

    .line 136
    .line 137
    add-int/2addr v3, v0

    .line 138
    add-int/2addr v3, v1

    .line 139
    iget p2, p2, La0/t;->m:I

    .line 140
    .line 141
    sub-int/2addr v3, p2

    .line 142
    int-to-float p2, v3

    .line 143
    neg-float p1, p1

    .line 144
    cmpg-float p1, p2, p1

    .line 145
    .line 146
    if-gez p1, :cond_6

    .line 147
    .line 148
    iget-object p1, v2, La0/a;->c:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p1, Lb0/y0;

    .line 151
    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    invoke-interface {p1}, Lb0/y0;->a()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_5
    invoke-static {v1}, Lvb/m;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, La0/u;

    .line 163
    .line 164
    iget p2, p2, La0/t;->l:I

    .line 165
    .line 166
    iget v0, v0, La0/u;->m:I

    .line 167
    .line 168
    sub-int/2addr p2, v0

    .line 169
    int-to-float p2, p2

    .line 170
    cmpg-float p1, p2, p1

    .line 171
    .line 172
    if-gez p1, :cond_6

    .line 173
    .line 174
    iget-object p1, v2, La0/a;->c:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p1, Lb0/y0;

    .line 177
    .line 178
    if-eqz p1, :cond_6

    .line 179
    .line 180
    invoke-interface {p1}, Lb0/y0;->a()V

    .line 181
    .line 182
    .line 183
    :cond_6
    return-void
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final i(IIZ)V
    .locals 4

    .line 1
    iget-object v0, p0, La0/g0;->d:La0/v;

    .line 2
    .line 3
    iget-object v1, v0, La0/v;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lx0/b1;

    .line 6
    .line 7
    invoke-virtual {v1}, Lx0/b1;->e()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v1, p1, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, La0/v;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lx0/b1;

    .line 17
    .line 18
    invoke-virtual {v1}, Lx0/b1;->e()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eq v1, p2, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, La0/g0;->m:Landroidx/compose/foundation/lazy/layout/b;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/b;->e()V

    .line 27
    .line 28
    .line 29
    iput-object v2, v1, Landroidx/compose/foundation/lazy/layout/b;->b:Lah/j;

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    iput v3, v1, Landroidx/compose/foundation/lazy/layout/b;->c:I

    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0, p1, p2}, La0/v;->q(II)V

    .line 35
    .line 36
    .line 37
    iput-object v2, v0, La0/v;->d:Ljava/lang/Object;

    .line 38
    .line 39
    if-eqz p3, :cond_3

    .line 40
    .line 41
    iget-object p1, p0, La0/g0;->j:Li2/j0;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1}, Li2/j0;->k()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void

    .line 49
    :cond_3
    iget-object p1, p0, La0/g0;->r:Lx0/w0;

    .line 50
    .line 51
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 52
    .line 53
    invoke-interface {p1, p2}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
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
