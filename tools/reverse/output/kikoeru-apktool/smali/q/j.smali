.class public final Lq/j;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lg2/g1;

.field public final synthetic d:J

.field public final synthetic e:Lj1/p;


# direct methods
.method public constructor <init>(Lg2/g1;Lq/e1;J)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq/j;->b:I

    .line 1
    iput-object p1, p0, Lq/j;->c:Lg2/g1;

    iput-object p2, p0, Lq/j;->e:Lj1/p;

    iput-wide p3, p0, Lq/j;->d:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lq/l;Lg2/g1;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lq/j;->b:I

    .line 2
    iput-object p1, p0, Lq/j;->e:Lj1/p;

    iput-object p2, p0, Lq/j;->c:Lg2/g1;

    iput-wide p3, p0, Lq/j;->d:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lq/j;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lg2/f1;

    .line 7
    .line 8
    iget-object v0, p0, Lq/j;->e:Lj1/p;

    .line 9
    .line 10
    check-cast v0, Lq/e1;

    .line 11
    .line 12
    invoke-virtual {p1}, Lg2/f1;->d()Lg2/c0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    iget-wide v3, p0, Lq/j;->d:J

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget-object v5, v0, Lq/e1;->o:Lq/h1;

    .line 22
    .line 23
    invoke-virtual {v5}, Lq/h1;->g()Lq/g1;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v5, v5, Lq/g1;->b:Lq/q1;

    .line 28
    .line 29
    iget-object v5, v5, Lq/q1;->h:Lg2/c0;

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    const-wide/16 v6, 0x0

    .line 34
    .line 35
    invoke-interface {v5, v1, v6, v7}, Lg2/c0;->o(Lg2/c0;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    iget-object v1, v0, Lq/e1;->o:Lq/h1;

    .line 40
    .line 41
    invoke-virtual {v1}, Lq/h1;->g()Lq/g1;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lq/g1;->a()Lp1/c;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    iget-object v1, v0, Lq/e1;->o:Lq/h1;

    .line 52
    .line 53
    invoke-virtual {v1}, Lq/h1;->g()Lq/g1;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v5, v6, v3, v4}, Ln7/b0;->f(JJ)Lp1/c;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    iget-object v1, v1, Lq/g1;->e:Lx0/e1;

    .line 62
    .line 63
    invoke-virtual {v1, v7}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    new-instance v1, Lp1/b;

    .line 67
    .line 68
    invoke-direct {v1, v5, v6}, Lp1/b;-><init>(J)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    const-string v0, "Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead."

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_2
    move-object v1, v2

    .line 81
    :goto_0
    iget-object v5, p0, Lq/j;->c:Lg2/g1;

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v7, 0x0

    .line 85
    invoke-virtual {p1, v5, v7, v7, v6}, Lg2/f1;->h(Lg2/g1;IIF)V

    .line 86
    .line 87
    .line 88
    if-eqz v1, :cond_8

    .line 89
    .line 90
    iget-wide v5, v1, Lp1/b;->a:J

    .line 91
    .line 92
    iget-object p1, v0, Lq/e1;->o:Lq/h1;

    .line 93
    .line 94
    invoke-virtual {p1}, Lq/h1;->g()Lq/g1;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object v0, v0, Lq/e1;->o:Lq/h1;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v1, p1, Lq/g1;->c:Lx0/e1;

    .line 104
    .line 105
    invoke-virtual {v0}, Lq/h1;->f()Lq/x;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-virtual {v8}, Lq/x;->b()Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_8

    .line 114
    .line 115
    iput-object v0, p1, Lq/g1;->f:Lq/h1;

    .line 116
    .line 117
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lp1/c;

    .line 122
    .line 123
    if-eqz v0, :cond_3

    .line 124
    .line 125
    invoke-virtual {v0}, Lp1/c;->d()J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    new-instance v0, Lp1/b;

    .line 130
    .line 131
    invoke-direct {v0, v8, v9}, Lp1/b;-><init>(J)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    move-object v0, v2

    .line 136
    :goto_1
    if-nez v0, :cond_4

    .line 137
    .line 138
    const/4 v0, 0x0

    .line 139
    goto :goto_2

    .line 140
    :cond_4
    iget-wide v8, v0, Lp1/b;->a:J

    .line 141
    .line 142
    invoke-static {v8, v9, v5, v6}, Lp1/b;->c(JJ)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    :goto_2
    if-eqz v0, :cond_7

    .line 147
    .line 148
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Lp1/c;

    .line 153
    .line 154
    if-eqz v0, :cond_5

    .line 155
    .line 156
    invoke-virtual {v0}, Lp1/c;->c()J

    .line 157
    .line 158
    .line 159
    move-result-wide v8

    .line 160
    new-instance v2, Lp1/e;

    .line 161
    .line 162
    invoke-direct {v2, v8, v9}, Lp1/e;-><init>(J)V

    .line 163
    .line 164
    .line 165
    :cond_5
    if-nez v2, :cond_6

    .line 166
    .line 167
    const/4 v0, 0x0

    .line 168
    goto :goto_3

    .line 169
    :cond_6
    iget-wide v8, v2, Lp1/e;->a:J

    .line 170
    .line 171
    invoke-static {v8, v9, v3, v4}, Lp1/e;->a(JJ)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    :goto_3
    if-nez v0, :cond_8

    .line 176
    .line 177
    :cond_7
    invoke-static {v5, v6, v3, v4}, Ln7/b0;->f(JJ)Lp1/c;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v1, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object v1, p1, Lq/g1;->g:Lh1/s;

    .line 185
    .line 186
    invoke-virtual {v1}, Lh1/s;->size()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    :goto_4
    if-ge v7, v2, :cond_8

    .line 191
    .line 192
    invoke-virtual {v1, v7}, Lh1/s;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    check-cast v3, Lq/h1;

    .line 197
    .line 198
    invoke-virtual {v3}, Lq/h1;->f()Lq/x;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {p1}, Lq/g1;->a()Lp1/c;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v4, v0}, Lq/x;->a(Lp1/c;Lp1/c;)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v7, v7, 0x1

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_8
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 216
    .line 217
    return-object p1

    .line 218
    :pswitch_0
    check-cast p1, Lg2/f1;

    .line 219
    .line 220
    iget-object v0, p0, Lq/j;->e:Lj1/p;

    .line 221
    .line 222
    check-cast v0, Lq/l;

    .line 223
    .line 224
    iget-object v0, v0, Lq/l;->q:Lq/m;

    .line 225
    .line 226
    iget-object v1, v0, Lq/m;->b:Lj1/d;

    .line 227
    .line 228
    iget-object v0, p0, Lq/j;->c:Lg2/g1;

    .line 229
    .line 230
    iget v2, v0, Lg2/g1;->a:I

    .line 231
    .line 232
    iget v3, v0, Lg2/g1;->b:I

    .line 233
    .line 234
    int-to-long v4, v2

    .line 235
    const/16 v2, 0x20

    .line 236
    .line 237
    shl-long/2addr v4, v2

    .line 238
    int-to-long v2, v3

    .line 239
    const-wide v6, 0xffffffffL

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    and-long/2addr v2, v6

    .line 245
    or-long/2addr v2, v4

    .line 246
    iget-wide v4, p0, Lq/j;->d:J

    .line 247
    .line 248
    sget-object v6, Lf3/m;->a:Lf3/m;

    .line 249
    .line 250
    invoke-interface/range {v1 .. v6}, Lj1/d;->a(JJLf3/m;)J

    .line 251
    .line 252
    .line 253
    move-result-wide v1

    .line 254
    invoke-static {p1, v0, v1, v2}, Lg2/f1;->j(Lg2/f1;Lg2/g1;J)V

    .line 255
    .line 256
    .line 257
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 258
    .line 259
    return-object p1

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method
