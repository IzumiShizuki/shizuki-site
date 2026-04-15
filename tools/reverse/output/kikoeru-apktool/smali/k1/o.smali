.class public final Lk1/o;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/p;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lk1/o;->b:I

    .line 2
    .line 3
    iput-object p2, p0, Lk1/o;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lk1/o;->b:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    move-object/from16 v2, p2

    .line 17
    .line 18
    check-cast v2, Lg2/c0;

    .line 19
    .line 20
    move-object/from16 v3, p3

    .line 21
    .line 22
    check-cast v3, Lp1/b;

    .line 23
    .line 24
    iget-wide v3, v3, Lp1/b;->a:J

    .line 25
    .line 26
    move-object/from16 v11, p4

    .line 27
    .line 28
    check-cast v11, Ll0/s;

    .line 29
    .line 30
    iget-object v5, v0, Lk1/o;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, Ll0/s0;

    .line 33
    .line 34
    invoke-interface {v2}, Lg2/c0;->k()J

    .line 35
    .line 36
    .line 37
    move-result-wide v6

    .line 38
    const/16 v8, 0x20

    .line 39
    .line 40
    shr-long v9, v6, v8

    .line 41
    .line 42
    long-to-int v10, v9

    .line 43
    int-to-float v9, v10

    .line 44
    const-wide v12, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v6, v12

    .line 50
    long-to-int v7, v6

    .line 51
    int-to-float v6, v7

    .line 52
    shr-long v14, v3, v8

    .line 53
    .line 54
    long-to-int v7, v14

    .line 55
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    const/4 v14, 0x0

    .line 60
    cmpg-float v15, v14, v10

    .line 61
    .line 62
    if-gtz v15, :cond_0

    .line 63
    .line 64
    cmpg-float v10, v10, v9

    .line 65
    .line 66
    if-gtz v10, :cond_0

    .line 67
    .line 68
    move v10, v9

    .line 69
    const/16 p1, 0x20

    .line 70
    .line 71
    and-long v8, v3, v12

    .line 72
    .line 73
    long-to-int v9, v8

    .line 74
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    cmpg-float v9, v14, v8

    .line 79
    .line 80
    if-gtz v9, :cond_1

    .line 81
    .line 82
    cmpg-float v8, v8, v6

    .line 83
    .line 84
    if-gtz v8, :cond_1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_0
    move v10, v9

    .line 88
    const/16 p1, 0x20

    .line 89
    .line 90
    :cond_1
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    cmpg-float v8, v8, v14

    .line 95
    .line 96
    if-gez v8, :cond_2

    .line 97
    .line 98
    const/4 v9, 0x0

    .line 99
    goto :goto_0

    .line 100
    :cond_2
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    cmpl-float v8, v8, v10

    .line 105
    .line 106
    if-lez v8, :cond_3

    .line 107
    .line 108
    move v9, v10

    .line 109
    goto :goto_0

    .line 110
    :cond_3
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    :goto_0
    and-long/2addr v3, v12

    .line 115
    long-to-int v4, v3

    .line 116
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    cmpg-float v3, v3, v14

    .line 121
    .line 122
    if-gez v3, :cond_4

    .line 123
    .line 124
    const/4 v6, 0x0

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    cmpl-float v3, v3, v6

    .line 131
    .line 132
    if-lez v3, :cond_5

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    :goto_1
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    int-to-long v3, v3

    .line 144
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    int-to-long v6, v6

    .line 149
    shl-long v3, v3, p1

    .line 150
    .line 151
    and-long/2addr v6, v12

    .line 152
    or-long/2addr v3, v6

    .line 153
    :goto_2
    invoke-static {v5, v2, v3, v4}, Ll0/s0;->a(Ll0/s0;Lg2/c0;J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v6

    .line 157
    const-wide v2, 0x7fffffff7fffffffL

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    and-long/2addr v2, v6

    .line 163
    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    cmp-long v4, v2, v8

    .line 169
    .line 170
    if-eqz v4, :cond_6

    .line 171
    .line 172
    invoke-virtual {v5, v1}, Ll0/s0;->l(Z)V

    .line 173
    .line 174
    .line 175
    const/4 v1, 0x0

    .line 176
    iput-object v1, v5, Ll0/s0;->r:Ll0/l0;

    .line 177
    .line 178
    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    const/4 v10, 0x0

    .line 184
    invoke-virtual/range {v5 .. v11}, Ll0/s0;->o(JJZLl0/s;)Z

    .line 185
    .line 186
    .line 187
    iget-object v1, v5, Ll0/s0;->h:Lo1/r;

    .line 188
    .line 189
    invoke-static {v1}, Lo1/r;->b(Lo1/r;)V

    .line 190
    .line 191
    .line 192
    const/4 v1, 0x0

    .line 193
    iput-boolean v1, v5, Ll0/s0;->s:Z

    .line 194
    .line 195
    invoke-virtual {v5}, Ll0/s0;->p()V

    .line 196
    .line 197
    .line 198
    :cond_6
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 199
    .line 200
    return-object v1

    .line 201
    :pswitch_0
    move-object/from16 v1, p1

    .line 202
    .line 203
    check-cast v1, Ljava/lang/Number;

    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    move-object/from16 v2, p2

    .line 210
    .line 211
    check-cast v2, Ljava/lang/Number;

    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    move-object/from16 v3, p3

    .line 218
    .line 219
    check-cast v3, Ljava/lang/Number;

    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    move-object/from16 v4, p4

    .line 226
    .line 227
    check-cast v4, Ljava/lang/Number;

    .line 228
    .line 229
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    iget-object v5, v0, Lk1/o;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v5, Landroid/view/ViewStructure;

    .line 236
    .line 237
    sub-int/2addr v3, v1

    .line 238
    sub-int/2addr v4, v2

    .line 239
    invoke-static {v5, v1, v2, v3, v4}, Lk1/f;->s(Landroid/view/ViewStructure;IIII)V

    .line 240
    .line 241
    .line 242
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 243
    .line 244
    return-object v1

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
.end method
