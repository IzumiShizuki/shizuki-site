.class public final synthetic Lm0/g8;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lm0/g8;->a:I

    .line 2
    .line 3
    iput p1, p0, Lm0/g8;->b:F

    .line 4
    .line 5
    iput-object p2, p0, Lm0/g8;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lm0/g8;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/g8;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ls/o;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Li2/l0;

    .line 12
    .line 13
    invoke-virtual {v1}, Li2/l0;->b()V

    .line 14
    .line 15
    .line 16
    iget-object p1, v1, Li2/l0;->a:Ls1/b;

    .line 17
    .line 18
    iget v2, p0, Lm0/g8;->b:F

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {v2, v3}, Lf3/f;->a(FF)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1}, Ls1/b;->a()F

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    iget-object p1, p1, Ls1/b;->b:Lc7/e1;

    .line 33
    .line 34
    mul-float v7, v4, v2

    .line 35
    .line 36
    invoke-virtual {p1}, Lc7/e1;->D()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    const-wide v8, 0xffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v4, v8

    .line 46
    long-to-int v2, v4

    .line 47
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v4, 0x2

    .line 52
    int-to-float v4, v4

    .line 53
    div-float v4, v7, v4

    .line 54
    .line 55
    sub-float/2addr v2, v4

    .line 56
    iget-object v0, v0, Ls/o;->b:Lq1/n0;

    .line 57
    .line 58
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    int-to-long v3, v3

    .line 63
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    int-to-long v5, v5

    .line 68
    const/16 v10, 0x20

    .line 69
    .line 70
    shl-long/2addr v3, v10

    .line 71
    and-long/2addr v5, v8

    .line 72
    or-long/2addr v3, v5

    .line 73
    invoke-virtual {p1}, Lc7/e1;->D()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    shr-long/2addr v5, v10

    .line 78
    long-to-int p1, v5

    .line 79
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    int-to-long v5, p1

    .line 88
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    int-to-long v11, p1

    .line 93
    shl-long/2addr v5, v10

    .line 94
    and-long/2addr v8, v11

    .line 95
    or-long/2addr v5, v8

    .line 96
    const/4 v8, 0x0

    .line 97
    const/16 v9, 0x1f0

    .line 98
    .line 99
    move-object v2, v0

    .line 100
    invoke-static/range {v1 .. v9}, Lq/t0;->l(Li2/l0;Lq1/n0;JJFFI)V

    .line 101
    .line 102
    .line 103
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 104
    .line 105
    return-object p1

    .line 106
    :pswitch_0
    iget-object v0, p0, Lm0/g8;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Lx0/w0;

    .line 109
    .line 110
    check-cast p1, Lp1/e;

    .line 111
    .line 112
    iget-wide v1, p1, Lp1/e;->a:J

    .line 113
    .line 114
    const/16 v3, 0x20

    .line 115
    .line 116
    shr-long/2addr v1, v3

    .line 117
    long-to-int v2, v1

    .line 118
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    iget v2, p0, Lm0/g8;->b:F

    .line 123
    .line 124
    mul-float v1, v1, v2

    .line 125
    .line 126
    iget-wide v4, p1, Lp1/e;->a:J

    .line 127
    .line 128
    const-wide v6, 0xffffffffL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    and-long/2addr v4, v6

    .line 134
    long-to-int p1, v4

    .line 135
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    mul-float p1, p1, v2

    .line 140
    .line 141
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Lp1/e;

    .line 146
    .line 147
    iget-wide v4, v2, Lp1/e;->a:J

    .line 148
    .line 149
    shr-long/2addr v4, v3

    .line 150
    long-to-int v2, v4

    .line 151
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    cmpg-float v2, v2, v1

    .line 156
    .line 157
    if-nez v2, :cond_1

    .line 158
    .line 159
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Lp1/e;

    .line 164
    .line 165
    iget-wide v4, v2, Lp1/e;->a:J

    .line 166
    .line 167
    and-long/2addr v4, v6

    .line 168
    long-to-int v2, v4

    .line 169
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    cmpg-float v2, v2, p1

    .line 174
    .line 175
    if-nez v2, :cond_1

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_1
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    int-to-long v1, v1

    .line 183
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    int-to-long v4, p1

    .line 188
    shl-long/2addr v1, v3

    .line 189
    and-long/2addr v4, v6

    .line 190
    or-long/2addr v1, v4

    .line 191
    new-instance p1, Lp1/e;

    .line 192
    .line 193
    invoke-direct {p1, v1, v2}, Lp1/e;-><init>(J)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v0, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 200
    .line 201
    return-object p1

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
