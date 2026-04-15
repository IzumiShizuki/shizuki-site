.class public final synthetic Lf1/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf1/f;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbg/a2;Lj1/q;Ljava/util/List;Lic/n;Lf1/f;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lf1/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/d;->d:Ljava/lang/Object;

    iput-object p2, p0, Lf1/d;->e:Ljava/lang/Object;

    iput-object p3, p0, Lf1/d;->f:Ljava/lang/Object;

    iput-object p4, p0, Lf1/d;->g:Ljava/lang/Object;

    iput-object p5, p0, Lf1/d;->b:Lf1/f;

    iput p6, p0, Lf1/d;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Lf1/f;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lf1/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/d;->b:Lf1/f;

    iput-object p2, p0, Lf1/d;->d:Ljava/lang/Object;

    iput-object p3, p0, Lf1/d;->e:Ljava/lang/Object;

    iput-object p4, p0, Lf1/d;->f:Ljava/lang/Object;

    iput-object p5, p0, Lf1/d;->g:Ljava/lang/Object;

    iput p6, p0, Lf1/d;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Lm0/u4;Lj1/q;Lic/n;Lf1/f;Lic/n;I)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lf1/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/d;->d:Ljava/lang/Object;

    iput-object p2, p0, Lf1/d;->e:Ljava/lang/Object;

    iput-object p3, p0, Lf1/d;->f:Ljava/lang/Object;

    iput-object p4, p0, Lf1/d;->b:Lf1/f;

    iput-object p5, p0, Lf1/d;->g:Ljava/lang/Object;

    iput p6, p0, Lf1/d;->c:I

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lf1/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf1/d;->d:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lm0/u4;

    .line 10
    .line 11
    iget-object v0, p0, Lf1/d;->e:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Lj1/q;

    .line 15
    .line 16
    iget-object v0, p0, Lf1/d;->f:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Lic/n;

    .line 20
    .line 21
    iget-object v0, p0, Lf1/d;->g:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    check-cast v5, Lic/n;

    .line 25
    .line 26
    move-object v6, p1

    .line 27
    check-cast v6, Lx0/o;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lf1/d;->c:I

    .line 35
    .line 36
    or-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    iget-object v4, p0, Lf1/d;->b:Lf1/f;

    .line 43
    .line 44
    invoke-virtual/range {v1 .. v7}, Lm0/u4;->a(Lj1/q;Lic/n;Lf1/f;Lic/n;Lx0/o;I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_0
    iget-object v0, p0, Lf1/d;->d:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v1, v0

    .line 53
    check-cast v1, Lbg/a2;

    .line 54
    .line 55
    iget-object v0, p0, Lf1/d;->e:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v2, v0

    .line 58
    check-cast v2, Lj1/q;

    .line 59
    .line 60
    iget-object v0, p0, Lf1/d;->f:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v3, v0

    .line 63
    check-cast v3, Ljava/util/List;

    .line 64
    .line 65
    iget-object v0, p0, Lf1/d;->g:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v4, v0

    .line 68
    check-cast v4, Lic/n;

    .line 69
    .line 70
    move-object v6, p1

    .line 71
    check-cast v6, Lx0/o;

    .line 72
    .line 73
    check-cast p2, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget p1, p0, Lf1/d;->c:I

    .line 79
    .line 80
    or-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    iget-object v5, p0, Lf1/d;->b:Lf1/f;

    .line 87
    .line 88
    invoke-static/range {v1 .. v7}, Lla/d0;->c(Lbg/a2;Lj1/q;Ljava/util/List;Lic/n;Lf1/f;Lx0/o;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_1
    move-object v5, p1

    .line 93
    check-cast v5, Lx0/o;

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    iget p1, p0, Lf1/d;->c:I

    .line 101
    .line 102
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    or-int/lit8 v6, p1, 0x1

    .line 107
    .line 108
    iget-object v0, p0, Lf1/d;->b:Lf1/f;

    .line 109
    .line 110
    iget-object v1, p0, Lf1/d;->d:Ljava/lang/Object;

    .line 111
    .line 112
    iget-object v2, p0, Lf1/d;->e:Ljava/lang/Object;

    .line 113
    .line 114
    iget-object v3, p0, Lf1/d;->f:Ljava/lang/Object;

    .line 115
    .line 116
    iget-object v4, p0, Lf1/d;->g:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual/range {v0 .. v6}, Lf1/f;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lx0/o;I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
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
.end method
