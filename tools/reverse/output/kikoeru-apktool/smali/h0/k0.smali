.class public final Lh0/k0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lg2/x0;Lg2/f0;Lg2/g1;II)V
    .locals 0

    .line 1
    iput p5, p0, Lh0/k0;->b:I

    iput-object p1, p0, Lh0/k0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lh0/k0;->f:Ljava/lang/Object;

    iput-object p3, p0, Lh0/k0;->d:Ljava/lang/Object;

    iput p4, p0, Lh0/k0;->e:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>([Lg2/g1;Ly/j1;I[I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lh0/k0;->b:I

    .line 2
    iput-object p1, p0, Lh0/k0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lh0/k0;->f:Ljava/lang/Object;

    iput p3, p0, Lh0/k0;->e:I

    iput-object p4, p0, Lh0/k0;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lh0/k0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lg2/f1;

    .line 7
    .line 8
    iget-object v0, p0, Lh0/k0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, [Lg2/g1;

    .line 11
    .line 12
    iget-object v1, p0, Lh0/k0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ly/j1;

    .line 15
    .line 16
    iget-object v2, p0, Lh0/k0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, [I

    .line 19
    .line 20
    array-length v3, v0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    :goto_0
    if-ge v5, v3, :cond_3

    .line 25
    .line 26
    aget-object v7, v0, v5

    .line 27
    .line 28
    add-int/lit8 v8, v6, 0x1

    .line 29
    .line 30
    invoke-static {v7}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7}, Lg2/g1;->A()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    instance-of v10, v9, Ly/h1;

    .line 38
    .line 39
    const/4 v11, 0x0

    .line 40
    if-eqz v10, :cond_0

    .line 41
    .line 42
    check-cast v9, Ly/h1;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    move-object v9, v11

    .line 46
    :goto_1
    if-eqz v9, :cond_1

    .line 47
    .line 48
    iget-object v11, v9, Ly/h1;->c:Ly/d;

    .line 49
    .line 50
    :cond_1
    iget v9, p0, Lh0/k0;->e:I

    .line 51
    .line 52
    if-eqz v11, :cond_2

    .line 53
    .line 54
    iget v10, v7, Lg2/g1;->b:I

    .line 55
    .line 56
    sub-int/2addr v9, v10

    .line 57
    sget-object v10, Lf3/m;->a:Lf3/m;

    .line 58
    .line 59
    invoke-virtual {v11, v9, v10}, Ly/d;->f(ILf3/m;)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v10, v1, Ly/j1;->b:Lj1/g;

    .line 65
    .line 66
    iget v11, v7, Lg2/g1;->b:I

    .line 67
    .line 68
    sub-int/2addr v9, v11

    .line 69
    invoke-virtual {v10, v4, v9}, Lj1/g;->a(II)I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    :goto_2
    aget v6, v2, v6

    .line 74
    .line 75
    invoke-static {p1, v7, v6, v9}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v5, v5, 0x1

    .line 79
    .line 80
    move v6, v8

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_0
    check-cast p1, Lg2/f1;

    .line 86
    .line 87
    iget-object v0, p0, Lh0/k0;->d:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lg2/g1;

    .line 90
    .line 91
    iget-object v1, p0, Lh0/k0;->c:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v2, v1

    .line 94
    check-cast v2, Lg2/x0;

    .line 95
    .line 96
    iget-object v1, p0, Lh0/k0;->f:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Lh0/u1;

    .line 99
    .line 100
    iget v3, v1, Lh0/u1;->b:I

    .line 101
    .line 102
    iget-object v8, v1, Lh0/u1;->a:Lh0/p1;

    .line 103
    .line 104
    iget-object v4, v1, Lh0/u1;->c:Ly2/d0;

    .line 105
    .line 106
    iget-object v1, v1, Lh0/u1;->d:Lic/a;

    .line 107
    .line 108
    invoke-interface {v1}, Lic/a;->b()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Lh0/r1;

    .line 113
    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    iget-object v1, v1, Lh0/r1;->a:Lt2/i0;

    .line 117
    .line 118
    :goto_3
    move-object v5, v1

    .line 119
    goto :goto_4

    .line 120
    :cond_4
    const/4 v1, 0x0

    .line 121
    goto :goto_3

    .line 122
    :goto_4
    const/4 v6, 0x0

    .line 123
    iget v7, v0, Lg2/g1;->a:I

    .line 124
    .line 125
    invoke-static/range {v2 .. v7}, Lh0/q0;->j(Lf3/c;ILy2/d0;Lt2/i0;ZI)Lp1/c;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iget v2, p0, Lh0/k0;->e:I

    .line 130
    .line 131
    iget v3, v0, Lg2/g1;->b:I

    .line 132
    .line 133
    sget-object v4, Lu/e1;->a:Lu/e1;

    .line 134
    .line 135
    invoke-virtual {v8, v4, v1, v2, v3}, Lh0/p1;->a(Lu/e1;Lp1/c;II)V

    .line 136
    .line 137
    .line 138
    iget-object v1, v8, Lh0/p1;->a:Lx0/a1;

    .line 139
    .line 140
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    neg-float v1, v1

    .line 145
    const/4 v2, 0x0

    .line 146
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-static {p1, v0, v2, v1}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 151
    .line 152
    .line 153
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 154
    .line 155
    return-object p1

    .line 156
    :pswitch_1
    check-cast p1, Lg2/f1;

    .line 157
    .line 158
    iget-object v0, p0, Lh0/k0;->d:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lg2/g1;

    .line 161
    .line 162
    iget-object v1, p0, Lh0/k0;->c:Ljava/lang/Object;

    .line 163
    .line 164
    move-object v2, v1

    .line 165
    check-cast v2, Lg2/x0;

    .line 166
    .line 167
    iget-object v1, p0, Lh0/k0;->f:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v1, Lh0/l0;

    .line 170
    .line 171
    iget v3, v1, Lh0/l0;->b:I

    .line 172
    .line 173
    iget-object v8, v1, Lh0/l0;->a:Lh0/p1;

    .line 174
    .line 175
    iget-object v4, v1, Lh0/l0;->c:Ly2/d0;

    .line 176
    .line 177
    iget-object v1, v1, Lh0/l0;->d:Lic/a;

    .line 178
    .line 179
    invoke-interface {v1}, Lic/a;->b()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Lh0/r1;

    .line 184
    .line 185
    if-eqz v1, :cond_5

    .line 186
    .line 187
    iget-object v1, v1, Lh0/r1;->a:Lt2/i0;

    .line 188
    .line 189
    :goto_5
    move-object v5, v1

    .line 190
    goto :goto_6

    .line 191
    :cond_5
    const/4 v1, 0x0

    .line 192
    goto :goto_5

    .line 193
    :goto_6
    invoke-interface {v2}, Lg2/y;->getLayoutDirection()Lf3/m;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    sget-object v6, Lf3/m;->b:Lf3/m;

    .line 198
    .line 199
    const/4 v9, 0x0

    .line 200
    if-ne v1, v6, :cond_6

    .line 201
    .line 202
    const/4 v1, 0x1

    .line 203
    const/4 v6, 0x1

    .line 204
    goto :goto_7

    .line 205
    :cond_6
    const/4 v6, 0x0

    .line 206
    :goto_7
    iget v7, v0, Lg2/g1;->a:I

    .line 207
    .line 208
    invoke-static/range {v2 .. v7}, Lh0/q0;->j(Lf3/c;ILy2/d0;Lt2/i0;ZI)Lp1/c;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iget v2, p0, Lh0/k0;->e:I

    .line 213
    .line 214
    iget v3, v0, Lg2/g1;->a:I

    .line 215
    .line 216
    sget-object v4, Lu/e1;->b:Lu/e1;

    .line 217
    .line 218
    invoke-virtual {v8, v4, v1, v2, v3}, Lh0/p1;->a(Lu/e1;Lp1/c;II)V

    .line 219
    .line 220
    .line 221
    iget-object v1, v8, Lh0/p1;->a:Lx0/a1;

    .line 222
    .line 223
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    neg-float v1, v1

    .line 228
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-static {p1, v0, v1, v9}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 233
    .line 234
    .line 235
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 236
    .line 237
    return-object p1

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
