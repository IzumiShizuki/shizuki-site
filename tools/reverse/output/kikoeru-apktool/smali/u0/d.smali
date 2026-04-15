.class public final Lu0/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ls/m0;


# instance fields
.field public final a:F

.field public final b:Lx0/w0;


# direct methods
.method public constructor <init>(FLx0/w0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lu0/d;->a:F

    .line 5
    .line 6
    iput-object p2, p0, Lu0/d;->b:Lx0/w0;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final a(Lw/k;Lx0/o;)Ls/n0;
    .locals 8

    .line 1
    const v0, 0x3aef0613

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Lx0/o;->W(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lu0/l;->a:Lx0/o2;

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lu0/c;

    .line 14
    .line 15
    iget-object v1, p0, Lu0/d;->b:Lx0/w0;

    .line 16
    .line 17
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lq1/q;

    .line 22
    .line 23
    iget-wide v2, v2, Lq1/q;->a:J

    .line 24
    .line 25
    const-wide/16 v4, 0x10

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    cmp-long v7, v2, v4

    .line 29
    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    const v2, -0x1217eb4e

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v2}, Lx0/o;->W(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, v6}, Lx0/o;->p(Z)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lq1/q;

    .line 46
    .line 47
    iget-wide v1, v1, Lq1/q;->a:J

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const v1, -0x12170996

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v1}, Lx0/o;->W(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const v1, 0x79b8960e

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v1}, Lx0/o;->W(I)V

    .line 63
    .line 64
    .line 65
    sget-wide v1, Lq1/q;->b:J

    .line 66
    .line 67
    invoke-static {v1, v2}, Lq1/h0;->r(J)F

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v6}, Lx0/o;->p(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v6}, Lx0/o;->p(Z)V

    .line 74
    .line 75
    .line 76
    :goto_0
    new-instance v3, Lq1/q;

    .line 77
    .line 78
    invoke-direct {v3, v1, v2}, Lq1/q;-><init>(J)V

    .line 79
    .line 80
    .line 81
    invoke-static {v3, p2}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const v0, -0x61250617

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v0}, Lx0/o;->W(I)V

    .line 92
    .line 93
    .line 94
    sget-wide v2, Lq1/q;->b:J

    .line 95
    .line 96
    invoke-static {v2, v3}, Lq1/h0;->r(J)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    float-to-double v2, v0

    .line 101
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    .line 102
    .line 103
    cmpl-double v0, v2, v4

    .line 104
    .line 105
    if-lez v0, :cond_1

    .line 106
    .line 107
    sget-object v0, Lu0/l;->b:Lu0/e;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    sget-object v0, Lu0/l;->c:Lu0/e;

    .line 111
    .line 112
    :goto_1
    invoke-virtual {p2, v6}, Lx0/o;->p(Z)V

    .line 113
    .line 114
    .line 115
    invoke-static {v0, p2}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const v2, 0x13be9e37

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, v2}, Lx0/o;->W(I)V

    .line 123
    .line 124
    .line 125
    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lx0/o2;

    .line 126
    .line 127
    invoke-virtual {p2, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Landroid/view/View;

    .line 132
    .line 133
    invoke-static {v2}, Ln7/e;->c(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {p2, p1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-virtual {p2, p0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    or-int/2addr v3, v4

    .line 146
    invoke-virtual {p2, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    or-int/2addr v3, v4

    .line 151
    invoke-virtual {p2}, Lx0/o;->K()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    sget-object v5, Lx0/k;->a:Lx0/r0;

    .line 156
    .line 157
    if-nez v3, :cond_2

    .line 158
    .line 159
    if-ne v4, v5, :cond_3

    .line 160
    .line 161
    :cond_2
    new-instance v4, Lu0/a;

    .line 162
    .line 163
    iget v3, p0, Lu0/d;->a:F

    .line 164
    .line 165
    invoke-direct {v4, v3, v1, v0, v2}, Lu0/a;-><init>(FLx0/w0;Lx0/w0;Landroid/view/ViewGroup;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, v4}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_3
    check-cast v4, Lu0/a;

    .line 172
    .line 173
    invoke-virtual {p2, v6}, Lx0/o;->p(Z)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, p1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-virtual {p2, v4}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    or-int/2addr v0, v1

    .line 185
    invoke-virtual {p2}, Lx0/o;->K()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    if-nez v0, :cond_4

    .line 190
    .line 191
    if-ne v1, v5, :cond_5

    .line 192
    .line 193
    :cond_4
    new-instance v1, Lq/q;

    .line 194
    .line 195
    const/4 v0, 0x0

    .line 196
    const/16 v2, 0x10

    .line 197
    .line 198
    invoke-direct {v1, p1, v4, v0, v2}, Lq/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_5
    check-cast v1, Lic/n;

    .line 205
    .line 206
    invoke-static {v4, p1, v1, p2}, Lx0/v;->f(Ljava/lang/Object;Ljava/lang/Object;Lic/n;Lx0/o;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p2, v6}, Lx0/o;->p(Z)V

    .line 210
    .line 211
    .line 212
    return-object v4
    .line 213
    .line 214
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lu0/d;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lu0/d;

    .line 10
    .line 11
    iget v0, p0, Lu0/d;->a:F

    .line 12
    .line 13
    iget v1, p1, Lu0/d;->a:F

    .line 14
    .line 15
    invoke-static {v0, v1}, Lf3/f;->a(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lu0/d;->b:Lx0/w0;

    .line 23
    .line 24
    iget-object p1, p1, Lu0/d;->b:Lx0/w0;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_3

    .line 31
    .line 32
    :goto_0
    const/4 p1, 0x0

    .line 33
    return p1

    .line 34
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 35
    return p1
    .line 36
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const v0, 0x95cb

    .line 2
    .line 3
    .line 4
    iget v1, p0, Lu0/d;->a:F

    .line 5
    .line 6
    const/16 v2, 0x1f

    .line 7
    .line 8
    invoke-static {v1, v0, v2}, Lq/t0;->x(FII)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lu0/d;->b:Lx0/w0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/2addr v1, v0

    .line 19
    return v1
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
