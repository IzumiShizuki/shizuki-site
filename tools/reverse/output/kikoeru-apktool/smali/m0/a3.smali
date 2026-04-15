.class public final Lm0/a3;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lm0/a3;->a:Z

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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p1

    .line 2
    .line 3
    check-cast v5, Lx0/o;

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v1, v0, 0x3

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    if-eq v1, v2, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    and-int/2addr v0, v4

    .line 24
    invoke-virtual {v5, v0, v1}, Lx0/o;->N(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    sget-object v0, Ls0/h;->b:Lw1/f;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    :goto_1
    move-object/from16 v8, p0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    new-instance v6, Lw1/e;

    .line 38
    .line 39
    const/4 v15, 0x0

    .line 40
    const/16 v16, 0xe0

    .line 41
    .line 42
    const-string v7, "Filled.ArrowDropDown"

    .line 43
    .line 44
    const/high16 v8, 0x41c00000    # 24.0f

    .line 45
    .line 46
    const/high16 v9, 0x41c00000    # 24.0f

    .line 47
    .line 48
    const/high16 v10, 0x41c00000    # 24.0f

    .line 49
    .line 50
    const/high16 v11, 0x41c00000    # 24.0f

    .line 51
    .line 52
    const-wide/16 v12, 0x0

    .line 53
    .line 54
    const/4 v14, 0x0

    .line 55
    invoke-direct/range {v6 .. v16}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 56
    .line 57
    .line 58
    sget v0, Lw1/g0;->a:I

    .line 59
    .line 60
    new-instance v0, Lq1/n0;

    .line 61
    .line 62
    sget-wide v1, Lq1/q;->b:J

    .line 63
    .line 64
    invoke-direct {v0, v1, v2}, Lq1/n0;-><init>(J)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Ljava/util/ArrayList;

    .line 68
    .line 69
    const/16 v2, 0x20

    .line 70
    .line 71
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Lw1/n;

    .line 75
    .line 76
    const/high16 v4, 0x40e00000    # 7.0f

    .line 77
    .line 78
    const/high16 v7, 0x41200000    # 10.0f

    .line 79
    .line 80
    invoke-direct {v2, v4, v7}, Lw1/n;-><init>(FF)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    new-instance v2, Lw1/u;

    .line 87
    .line 88
    const/high16 v4, 0x40a00000    # 5.0f

    .line 89
    .line 90
    invoke-direct {v2, v4, v4}, Lw1/u;-><init>(FF)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    new-instance v2, Lw1/u;

    .line 97
    .line 98
    const/high16 v7, -0x3f600000    # -5.0f

    .line 99
    .line 100
    invoke-direct {v2, v4, v7}, Lw1/u;-><init>(FF)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    sget-object v2, Lw1/j;->c:Lw1/j;

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    invoke-static {v6, v1, v3, v0}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6}, Lw1/e;->b()Lw1/f;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, Ls0/h;->b:Lw1/f;

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :goto_2
    iget-boolean v1, v8, Lm0/a3;->a:Z

    .line 122
    .line 123
    if-eqz v1, :cond_2

    .line 124
    .line 125
    const/high16 v1, 0x43340000    # 180.0f

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_2
    const/high16 v1, 0x43b40000    # 360.0f

    .line 129
    .line 130
    :goto_3
    const/4 v2, 0x0

    .line 131
    sget-object v3, Lj1/n;->a:Lj1/n;

    .line 132
    .line 133
    cmpg-float v4, v1, v2

    .line 134
    .line 135
    if-nez v4, :cond_3

    .line 136
    .line 137
    :goto_4
    move-object v2, v3

    .line 138
    goto :goto_5

    .line 139
    :cond_3
    const/4 v4, 0x0

    .line 140
    const v6, 0x7feff

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v2, v1, v4, v6}, Landroidx/compose/ui/graphics/a;->c(Lj1/q;FFLq1/l0;I)Lj1/q;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    goto :goto_4

    .line 148
    :goto_5
    const/16 v6, 0x30

    .line 149
    .line 150
    const/16 v7, 0x8

    .line 151
    .line 152
    const-string v1, "Trailing icon for exposed dropdown menu"

    .line 153
    .line 154
    const-wide/16 v3, 0x0

    .line 155
    .line 156
    invoke-static/range {v0 .. v7}, Lm0/r3;->b(Lw1/f;Ljava/lang/String;Lj1/q;JLx0/o;II)V

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_4
    move-object/from16 v8, p0

    .line 161
    .line 162
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 163
    .line 164
    .line 165
    :goto_6
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 166
    .line 167
    return-object v0
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
.end method
