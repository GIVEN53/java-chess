package domain.piece;

class PieceTest {
//    @Nested
//    class 룩 {
//        private final Piece rook = new Piece(Type.ROOK, Color.WHITE);
//
//        @Test
//        void UP_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.F, Rank.FIVE);
//            Position target = new Position(File.F, Rank.EIGHT);
//
//            List<Position> positions = rook.route(source, target);
//            assertThat(positions).hasSize(2);
//            assertThat(positions).containsExactlyElementsOf(List.of(
//                    new Position(File.F, Rank.SIX),
//                    new Position(File.F, Rank.SEVEN)
//            ));
//        }
//
//        @Test
//        void DOWN_LEFT_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.F, Rank.FIVE);
//            Position target = new Position(File.C, Rank.TWO);
//
//            assertThatThrownBy(() -> rook.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void L자_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.F, Rank.FIVE);
//            Position target = new Position(File.H, Rank.FOUR);
//
//            assertThatThrownBy(() -> rook.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void 정의되지_않은_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.F, Rank.FIVE);
//            Position target = new Position(File.A, Rank.ONE);
//
//            assertThatThrownBy(() -> rook.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class);
//        }
//    }
//
//    @Nested
//    class 비숍 {
//        private final Piece bishop = new Piece(Type.BISHOP, Color.WHITE);
//
//        @Test
//        void UP_LEFT_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.C, Rank.TWO);
//            Position target = new Position(File.F, Rank.FIVE);
//
//            List<Position> positions = bishop.route(source, target);
//            assertThat(positions).hasSize(2);
//            assertThat(positions).containsExactlyElementsOf(List.of(
//                    new Position(File.D, Rank.THREE),
//                    new Position(File.E, Rank.FOUR)
//            ));
//        }
//
//        @Test
//        void UP_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.C, Rank.TWO);
//            Position target = new Position(File.C, Rank.FIVE);
//
//            assertThatThrownBy(() -> bishop.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void L자_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.C, Rank.TWO);
//            Position target = new Position(File.E, Rank.THREE);
//
//            assertThatThrownBy(() -> bishop.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void 정의되지_않은_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.F, Rank.FIVE);
//            Position target = new Position(File.A, Rank.ONE);
//
//            assertThatThrownBy(() -> bishop.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class);
//        }
//    }
//
//    @Nested
//    class 퀸 {
//        private final Piece queen = new Piece(Type.QUEEN, Color.WHITE);
//
//        @Test
//        void UP_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.D, Rank.EIGHT);
//
//            List<Position> positions = queen.route(source, target);
//            assertThat(positions).hasSize(3);
//            assertThat(positions).containsExactlyElementsOf(List.of(
//                    new Position(File.D, Rank.FIVE),
//                    new Position(File.D, Rank.SIX),
//                    new Position(File.D, Rank.SEVEN)
//            ));
//        }
//
//        @Test
//        void DOWN_RIGHT_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.G, Rank.ONE);
//
//            List<Position> positions = queen.route(source, target);
//            assertThat(positions).hasSize(2);
//            assertThat(positions).containsExactlyElementsOf(List.of(
//                    new Position(File.E, Rank.THREE),
//                    new Position(File.F, Rank.TWO)
//            ));
//        }
//
//        @Test
//        void L자_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.F, Rank.THREE);
//
//            assertThatThrownBy(() -> queen.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void 정의되지_않은_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.A, Rank.TWO);
//
//            assertThatThrownBy(() -> queen.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class);
//        }
//    }

//    @Nested
//    class 킹 {
//        private final Piece1 king = new King(Color.WHITE);
//
//        @Test
//        void 한_칸_이동하면_예외가_발생하지_않는다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.E, Rank.FIVE);
//            Piece1 other = new Pawn(Color.BLACK);
//
//            assertThatCode(() -> king.validateMovement(source, target, other))
//                    .doesNotThrowAnyException();
//        }
//
//        @Test
//        void 한_칸_이상_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.F, Rank.FOUR);
//            Piece1 other = new Pawn(Color.BLACK);
//
//            assertThatThrownBy(() -> king.validateMovement(source, target, other))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void 이동하지_않으면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.D, Rank.FOUR);
//            Piece1 other = new Pawn(Color.BLACK);
//
//            assertThatThrownBy(() -> king.validateMovement(source, target, other))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 거리입니다.");
//        }
//
//        @Test
//        void 같은_팀의_말을_잡으면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.E, Rank.FIVE);
//            Piece1 other = new Pawn(Color.WHITE);
//
//            assertThatThrownBy(() -> king.validateMovement(source, target, other))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("같은 팀의 말을 잡을 수 없습니다.");
//        }
//    }
//
//    @Nested
//    class 나이트 {
//        private final Piece knight = new Piece(Type.KNIGHT, Color.WHITE);
//
//        @Test
//        void KNIGHT_UP_LEFT_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.C, Rank.SIX);
//
//            List<Position> positions = knight.route(source, target);
//            assertThat(positions).hasSize(0);
//        }
//
//        @Test
//        void UP_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.D, Rank.FIVE);
//
//            assertThatThrownBy(() -> knight.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void DOWN_LEFT_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.FOUR);
//            Position target = new Position(File.B, Rank.TWO);
//
//            assertThatThrownBy(() -> knight.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//    }
//
//    @Nested
//    class 화이트_폰 {
//        private final Piece whitePawn = new Piece(Type.WHITE_PAWN, Color.WHITE);
//
//        @Test
//        void UP_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.D, Rank.THREE);
//
//            List<Position> positions = whitePawn.route(source, target);
//            assertThat(positions).hasSize(0);
//        }
//
//        @Test
//        void UP_LEFT_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.C, Rank.THREE);
//
//            List<Position> positions = whitePawn.route(source, target);
//            assertThat(positions).hasSize(0);
//        }
//
//        @Test
//        void UP_RIGHT_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.E, Rank.THREE);
//
//            List<Position> positions = whitePawn.route(source, target);
//            assertThat(positions).hasSize(0);
//        }
//
//        @Test
//        void 첫_위치에서_UP_방향으로_두_칸_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.D, Rank.FOUR);
//
//            List<Position> positions = whitePawn.route(source, target);
//            assertThat(positions).hasSize(1);
//            assertThat(positions).containsExactly(new Position(File.D, Rank.THREE));
//        }
//
//        @Test
//        void UP_방향으로_두_칸_이상_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.D, Rank.FOUR);
//
//            assertThatThrownBy(() -> whitePawn.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 거리입니다.");
//        }
//
//        @Test
//        void DOWN_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.D, Rank.ONE);
//
//            assertThatThrownBy(() -> whitePawn.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void DOWN_LEFT_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.C, Rank.ONE);
//
//            assertThatThrownBy(() -> whitePawn.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void L자_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.F, Rank.THREE);
//
//            assertThatThrownBy(() -> whitePawn.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//    }
//
//    @Nested
//    class 블랙_폰 {
//        private final Piece blackPawn = new Piece(Type.BLACK_PAWN, Color.BLACK);
//
//        @Test
//        void DOWN_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.D, Rank.ONE);
//
//            List<Position> positions = blackPawn.route(source, target);
//            assertThat(positions).hasSize(0);
//        }
//
//        @Test
//        void DOWN_LEFT_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.C, Rank.ONE);
//
//            List<Position> positions = blackPawn.route(source, target);
//            assertThat(positions).hasSize(0);
//        }
//
//        @Test
//        void DOWN_RIGHT_방향으로_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.E, Rank.ONE);
//
//            List<Position> positions = blackPawn.route(source, target);
//            assertThat(positions).hasSize(0);
//        }
//
//        @Test
//        void 첫_위치에서_DOWN_방향으로_두_칸_이동하는_경로를_반환한다() {
//            Position source = new Position(File.D, Rank.SEVEN);
//            Position target = new Position(File.D, Rank.FIVE);
//
//            List<Position> positions = blackPawn.route(source, target);
//            assertThat(positions).hasSize(1);
//            assertThat(positions).containsExactly(new Position(File.D, Rank.SIX));
//        }
//
//        @Test
//        void DOWN_방향으로_두_칸_이상_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.THREE);
//            Position target = new Position(File.D, Rank.ONE);
//
//            assertThatThrownBy(() -> blackPawn.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 거리입니다.");
//        }
//
//        @Test
//        void UP_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.D, Rank.THREE);
//
//            assertThatThrownBy(() -> blackPawn.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void UP_LEFT_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.C, Rank.THREE);
//
//            assertThatThrownBy(() -> blackPawn.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//
//        @Test
//        void L자_방향으로_이동하면_예외가_발생한다() {
//            Position source = new Position(File.D, Rank.TWO);
//            Position target = new Position(File.F, Rank.ONE);
//
//            assertThatThrownBy(() -> blackPawn.route(source, target))
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("이동할 수 없는 방향입니다.");
//        }
//    }
}
