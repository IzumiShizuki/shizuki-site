.class public final Lg2/q0;
.super Lg2/f1;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lg2/q0;->b:I

    .line 2
    .line 3
    iput-object p2, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
.method public final M()F
    .locals 1

    .line 1
    iget v0, p0, Lg2/q0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj2/v;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj2/v;->getDensity()Lf3/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lf3/c;->M()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Li2/q0;

    .line 22
    .line 23
    invoke-interface {v0}, Lf3/c;->M()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final a()F
    .locals 1

    .line 1
    iget v0, p0, Lg2/q0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj2/v;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj2/v;->getDensity()Lf3/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lf3/c;->a()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Li2/q0;

    .line 22
    .line 23
    invoke-interface {v0}, Lf3/c;->a()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lg2/v;)F
    .locals 8

    .line 1
    iget v0, p0, Lg2/q0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lg2/f1;->c(Lg2/v;)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object v0, p1, Lg2/v;->a:Lic/n;

    .line 12
    .line 13
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {v0, p0, p1}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Li2/q0;

    .line 36
    .line 37
    iget-boolean v2, v0, Li2/q0;->k:Z

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_1
    move-object v2, v0

    .line 44
    :goto_0
    iget-object v3, v2, Li2/q0;->m:Lh7/i;

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    iget-object v4, v3, Lh7/i;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, [Lg2/v;

    .line 51
    .line 52
    invoke-static {p1, v4}, Lvb/l;->A0(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-gez v4, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-object v3, v3, Lh7/i;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, [F

    .line 62
    .line 63
    aget v3, v3, v4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :goto_1
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 67
    .line 68
    :goto_2
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0}, Li2/q0;->t0()Li2/j0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v2, v1, p1}, Li2/q0;->l0(Li2/j0;Lg2/v;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Li2/q0;->r0()Lg2/c0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0}, Li2/q0;->r0()Lg2/c0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget p1, p1, Lg2/v;->b:I

    .line 90
    .line 91
    packed-switch p1, :pswitch_data_1

    .line 92
    .line 93
    .line 94
    invoke-interface {v1}, Lg2/c0;->k()J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    const-wide v6, 0xffffffffL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    and-long/2addr v4, v6

    .line 104
    long-to-int p1, v4

    .line 105
    int-to-float p1, p1

    .line 106
    const/high16 v2, 0x40000000    # 2.0f

    .line 107
    .line 108
    div-float/2addr p1, v2

    .line 109
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    int-to-long v2, v2

    .line 114
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    int-to-long v4, p1

    .line 119
    const/16 p1, 0x20

    .line 120
    .line 121
    shl-long/2addr v2, p1

    .line 122
    and-long/2addr v4, v6

    .line 123
    or-long/2addr v2, v4

    .line 124
    invoke-interface {v0, v1, v2, v3}, Lg2/c0;->o(Lg2/c0;J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v0

    .line 128
    shr-long/2addr v0, p1

    .line 129
    long-to-int p1, v0

    .line 130
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    :goto_3
    move v1, p1

    .line 135
    goto :goto_4

    .line 136
    :pswitch_1
    invoke-interface {v1}, Lg2/c0;->k()J

    .line 137
    .line 138
    .line 139
    move-result-wide v4

    .line 140
    const/16 p1, 0x20

    .line 141
    .line 142
    shr-long/2addr v4, p1

    .line 143
    long-to-int v2, v4

    .line 144
    int-to-float v2, v2

    .line 145
    const/high16 v4, 0x40000000    # 2.0f

    .line 146
    .line 147
    div-float/2addr v2, v4

    .line 148
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    int-to-long v4, v2

    .line 153
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    int-to-long v2, v2

    .line 158
    shl-long/2addr v4, p1

    .line 159
    const-wide v6, 0xffffffffL

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    and-long/2addr v2, v6

    .line 165
    or-long/2addr v2, v4

    .line 166
    invoke-interface {v0, v1, v2, v3}, Lg2/c0;->o(Lg2/c0;J)J

    .line 167
    .line 168
    .line 169
    move-result-wide v0

    .line 170
    and-long/2addr v0, v6

    .line 171
    long-to-int p1, v0

    .line 172
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    goto :goto_3

    .line 177
    :cond_4
    invoke-virtual {v2}, Li2/q0;->v0()Li2/q0;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-nez v3, :cond_5

    .line 182
    .line 183
    invoke-virtual {v0}, Li2/q0;->t0()Li2/j0;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v2, v0, p1}, Li2/q0;->l0(Li2/j0;Lg2/v;)V

    .line 188
    .line 189
    .line 190
    :goto_4
    return v1

    .line 191
    :cond_5
    move-object v2, v3

    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
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
.end method

.method public final d()Lg2/c0;
    .locals 2

    .line 1
    iget v0, p0, Lg2/q0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj2/v;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj2/v;->getRoot()Li2/j0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Li2/j0;->F:Li2/d1;

    .line 15
    .line 16
    iget-object v0, v0, Li2/d1;->d:Li2/g1;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Li2/q0;

    .line 22
    .line 23
    iget-boolean v1, v0, Li2/q0;->k:Z

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v0}, Li2/q0;->r0()Lg2/c0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    if-nez v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Li2/q0;->t0()Li2/j0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, Li2/j0;->G:Li2/n0;

    .line 40
    .line 41
    invoke-virtual {v0}, Li2/n0;->b()V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-object v1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final f()Lf3/m;
    .locals 1

    .line 1
    iget v0, p0, Lg2/q0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj2/v;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj2/v;->getLayoutDirection()Lf3/m;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Li2/q0;

    .line 18
    .line 19
    invoke-interface {v0}, Lg2/y;->getLayoutDirection()Lf3/m;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lg2/q0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj2/v;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj2/v;->getRoot()Li2/j0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Li2/j0;->G:Li2/n0;

    .line 15
    .line 16
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 17
    .line 18
    iget v0, v0, Lg2/g1;->a:I

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_0
    iget-object v0, p0, Lg2/q0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Li2/q0;

    .line 24
    .line 25
    invoke-virtual {v0}, Lg2/g1;->W()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
