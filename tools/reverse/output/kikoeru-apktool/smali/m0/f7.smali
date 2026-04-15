.class public final synthetic Lm0/f7;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm0/c2;


# direct methods
.method public synthetic constructor <init>(Lm0/c2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm0/f7;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/f7;->b:Lm0/c2;

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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lm0/f7;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Float;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Lm0/f7;->b:Lm0/c2;

    .line 13
    .line 14
    iget-object v1, v0, Lm0/c2;->g:Lx0/a1;

    .line 15
    .line 16
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-float/2addr v2, p1

    .line 21
    iget p1, v0, Lm0/c2;->k:F

    .line 22
    .line 23
    iget v3, v0, Lm0/c2;->l:F

    .line 24
    .line 25
    invoke-static {v2, p1, v3}, Lnh/b;->j(FFF)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    sub-float v3, v2, p1

    .line 30
    .line 31
    iget-object v4, v0, Lm0/c2;->o:Lx0/e1;

    .line 32
    .line 33
    invoke-virtual {v4}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lm0/j5;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    cmpg-float v6, v3, v5

    .line 43
    .line 44
    if-gez v6, :cond_0

    .line 45
    .line 46
    iget v6, v4, Lm0/j5;->b:F

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget v6, v4, Lm0/j5;->c:F

    .line 50
    .line 51
    :goto_0
    cmpg-float v7, v6, v5

    .line 52
    .line 53
    if-nez v7, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    iget v4, v4, Lm0/j5;->a:F

    .line 57
    .line 58
    div-float v5, v3, v4

    .line 59
    .line 60
    const/high16 v7, -0x40800000    # -1.0f

    .line 61
    .line 62
    cmpg-float v8, v5, v7

    .line 63
    .line 64
    if-gez v8, :cond_2

    .line 65
    .line 66
    const/high16 v5, -0x40800000    # -1.0f

    .line 67
    .line 68
    :cond_2
    const/high16 v7, 0x3f800000    # 1.0f

    .line 69
    .line 70
    cmpl-float v8, v5, v7

    .line 71
    .line 72
    if-lez v8, :cond_3

    .line 73
    .line 74
    const/high16 v5, 0x3f800000    # 1.0f

    .line 75
    .line 76
    :cond_3
    div-float/2addr v4, v6

    .line 77
    const v6, 0x40490fdb    # (float)Math.PI

    .line 78
    .line 79
    .line 80
    mul-float v5, v5, v6

    .line 81
    .line 82
    const/4 v6, 0x2

    .line 83
    int-to-float v6, v6

    .line 84
    div-float/2addr v5, v6

    .line 85
    float-to-double v5, v5

    .line 86
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    double-to-float v5, v5

    .line 91
    mul-float v5, v5, v4

    .line 92
    .line 93
    :cond_4
    :goto_1
    iget-object v4, v0, Lm0/c2;->e:Lx0/a1;

    .line 94
    .line 95
    add-float/2addr p1, v5

    .line 96
    invoke-virtual {v4, p1}, Lx0/a1;->f(F)V

    .line 97
    .line 98
    .line 99
    iget-object p1, v0, Lm0/c2;->f:Lx0/a1;

    .line 100
    .line 101
    invoke-virtual {p1, v3}, Lx0/a1;->f(F)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, Lx0/a1;->f(F)V

    .line 105
    .line 106
    .line 107
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 108
    .line 109
    return-object p1

    .line 110
    :pswitch_0
    check-cast p1, Lf3/c;

    .line 111
    .line 112
    iget-object p1, p0, Lm0/f7;->b:Lm0/c2;

    .line 113
    .line 114
    iget-object p1, p1, Lm0/c2;->e:Lx0/a1;

    .line 115
    .line 116
    invoke-virtual {p1}, Lx0/a1;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, Ljava/lang/Number;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-static {p1}, Llc/b;->R(F)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    int-to-long v0, p1

    .line 131
    const/16 p1, 0x20

    .line 132
    .line 133
    shl-long/2addr v0, p1

    .line 134
    const/4 p1, 0x0

    .line 135
    int-to-long v2, p1

    .line 136
    const-wide v4, 0xffffffffL

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    and-long/2addr v2, v4

    .line 142
    or-long/2addr v0, v2

    .line 143
    new-instance p1, Lf3/j;

    .line 144
    .line 145
    invoke-direct {p1, v0, v1}, Lf3/j;-><init>(J)V

    .line 146
    .line 147
    .line 148
    return-object p1

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
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
