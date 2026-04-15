.class public abstract Lm0/a1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Lm0/a1;->a:F

    .line 5
    .line 6
    return-void
    .line 7
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

.method public static a(JJLx0/o;I)Lm0/q1;
    .locals 16

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    and-int/lit8 v1, p5, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lm0/c1;->a:Lx0/o2;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lm0/b1;

    .line 14
    .line 15
    invoke-virtual {v2}, Lm0/b1;->e()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    const v4, 0x3df5c28f    # 0.12f

    .line 20
    .line 21
    .line 22
    invoke-static {v4, v2, v3}, Lq1/q;->b(FJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-virtual {v0, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lm0/b1;

    .line 31
    .line 32
    invoke-virtual {v1}, Lm0/b1;->i()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    invoke-static {v2, v3, v4, v5}, Lq1/h0;->l(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    move-wide v4, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-wide/from16 v4, p0

    .line 43
    .line 44
    :goto_0
    and-int/lit8 v1, p5, 0x2

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    sget-object v1, Lm0/c1;->a:Lx0/o2;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lm0/b1;

    .line 55
    .line 56
    invoke-virtual {v1}, Lm0/b1;->e()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    const v3, 0x3f5eb852    # 0.87f

    .line 61
    .line 62
    .line 63
    invoke-static {v3, v1, v2}, Lq1/q;->b(FJ)J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    move-wide v6, v1

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move-wide/from16 v6, p2

    .line 70
    .line 71
    :goto_1
    const v1, 0x3f0a3d71    # 0.54f

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v6, v7}, Lq1/q;->b(FJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v8

    .line 78
    sget-object v1, Lm0/c1;->a:Lx0/o2;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lm0/b1;

    .line 85
    .line 86
    invoke-virtual {v2}, Lm0/b1;->e()J

    .line 87
    .line 88
    .line 89
    move-result-wide v2

    .line 90
    sget-object v10, Lm0/j1;->a:Lx0/z;

    .line 91
    .line 92
    invoke-virtual {v0, v10}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    check-cast v11, Lq1/q;

    .line 97
    .line 98
    iget-wide v11, v11, Lq1/q;->a:J

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v13

    .line 104
    check-cast v13, Lm0/b1;

    .line 105
    .line 106
    invoke-virtual {v13}, Lm0/b1;->j()Z

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    if-eqz v13, :cond_2

    .line 111
    .line 112
    invoke-static {v11, v12}, Lq1/h0;->r(J)F

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    invoke-static {v11, v12}, Lq1/h0;->r(J)F

    .line 117
    .line 118
    .line 119
    :goto_2
    const v11, 0x3d3ac710    # 0.045599997f

    .line 120
    .line 121
    .line 122
    invoke-static {v11, v2, v3}, Lq1/q;->b(FJ)J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    invoke-virtual {v0, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    check-cast v11, Lm0/b1;

    .line 131
    .line 132
    invoke-virtual {v11}, Lm0/b1;->i()J

    .line 133
    .line 134
    .line 135
    move-result-wide v11

    .line 136
    invoke-static {v2, v3, v11, v12}, Lq1/h0;->l(JJ)J

    .line 137
    .line 138
    .line 139
    move-result-wide v2

    .line 140
    invoke-virtual {v0, v10}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    check-cast v11, Lq1/q;

    .line 145
    .line 146
    iget-wide v11, v11, Lq1/q;->a:J

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    check-cast v13, Lm0/b1;

    .line 153
    .line 154
    invoke-virtual {v13}, Lm0/b1;->j()Z

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eqz v13, :cond_3

    .line 159
    .line 160
    invoke-static {v11, v12}, Lq1/h0;->r(J)F

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_3
    invoke-static {v11, v12}, Lq1/h0;->r(J)F

    .line 165
    .line 166
    .line 167
    :goto_3
    const v11, 0x3ea94467    # 0.3306f

    .line 168
    .line 169
    .line 170
    invoke-static {v11, v6, v7}, Lq1/q;->b(FJ)J

    .line 171
    .line 172
    .line 173
    move-result-wide v12

    .line 174
    invoke-virtual {v0, v10}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    check-cast v10, Lq1/q;

    .line 179
    .line 180
    iget-wide v10, v10, Lq1/q;->a:J

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Lm0/b1;

    .line 187
    .line 188
    invoke-virtual {v0}, Lm0/b1;->j()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_4

    .line 193
    .line 194
    invoke-static {v10, v11}, Lq1/h0;->r(J)F

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_4
    invoke-static {v10, v11}, Lq1/h0;->r(J)F

    .line 199
    .line 200
    .line 201
    :goto_4
    const v0, 0x3e521ff3    # 0.2052f

    .line 202
    .line 203
    .line 204
    invoke-static {v0, v8, v9}, Lq1/q;->b(FJ)J

    .line 205
    .line 206
    .line 207
    move-result-wide v14

    .line 208
    move-wide v10, v2

    .line 209
    new-instance v3, Lm0/q1;

    .line 210
    .line 211
    invoke-direct/range {v3 .. v15}, Lm0/q1;-><init>(JJJJJJ)V

    .line 212
    .line 213
    .line 214
    return-object v3
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
.end method
